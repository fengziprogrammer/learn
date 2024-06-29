/*
1个字节可以存储多大数字？ -128 ~ 127
为什么？

计算机存储数字有一个规则：
（1）符号位
二进制数的最高位，最左边的位，用0表示正、1表示负数
25： 00011001
-25: 10011001

-25-25 = 10000000 = -0 = 0（结果是错）

（2）底层用补码表示
正数：补码和它的原码、反码一致，三码合一
负数：补码和它的原码、反码不一致

原码：十进制转为二进制，并且最高位符号位处理好
25： 
	原码：00011001
-25: 
	原码：10011001
反码：对于正数来说，反码和原码一样
	  对于负数来说，符号位不变，其余位取反（1变0,0变1）
25： 
	原码：00011001
	反码：00011001
-25: 
	原码：10011001
	反码：11100110
补码：对于正数来说，反码和原码，补码一样	
	  对于负数来说，在反码的基础上+1
25： 
	原码：00011001
	反码：00011001
	补码：00011001
-25: 
	原码：10011001
	反码：11100110	  
	补码：11100111

-25-25 = 	11100111 - 00011001 = 11001110（补码）
11001110（补码）
11001101（反码）
10110010（原码）= -50

一个字节可以表示的数字范围？
01111111->127
00000001->1

11111111（补码）->11111110（反码）->10000001（原码） -1
10000001（补码）->10000000（反码）->11111111（原码）-127

00000000 -> 0
10000000 -> 用它表示-0浪费，用它表示-128。

为什么是-128？
10000001（是-127） - 00000001（是1） = 10000000（结果应该是-128）
*/