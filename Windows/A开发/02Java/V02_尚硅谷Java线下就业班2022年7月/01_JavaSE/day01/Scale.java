/*
进制：
	生活中用十进制
		数字范围：0-9，进位规则：逢十进一
	计算机中二进制
		数字范围：0-1，进位规则：逢二进一
	其他进制：
		八进制和十六进制
	八进制：
		数字范围：0-7，进位规则：逢八进一
	十六进制：
		数字范围：0-9，A-F（a-f），进位规则：逢十六进一


| 十进制 | 二进制 | 八进制 | 十六进制 |
| ------ | ------ | ------ | -------- |
| 0      | 0      | 0      | 0        |
| 1      | 1      | 1      | 1        |
| 2      | 10     | 2      | 2        |
| 3      | 11     | 3      | 3        |
| 4      | 100    | 4      | 4        |
| 5      | 101    | 5      | 5        |
| 6      | 110    | 6      | 6        |
| 7      | 111    | 7      | 7        |
| 8      | 1000   | 10     | 8        |
| 9      | 1001   | 11     | 9        |
| 10     | 1010   | 12     | a或A     |
| 11     | 1011   | 13     | b或B     |
| 12     | 1100   | 14     | c或C     |
| 13     | 1101   | 15     | d或D     |
| 14     | 1110   | 16     | e或E     |
| 15     | 1111   | 17     | f或F     |
| 16     | 10000  | 20     | 10       |	

整数换算规则：
十进制->二进制：除2倒取余
二进制->十进制：每一位的数字*2的n次方，然后相加
二进制->八进制：每三位一组
八进制->二进制：1位代表3位二进制
二进制->十六进制：每四位一组
十六进制->二进制：1位代表4位二进制
	
*/
public class Scale{
	public static void main(String[] args){
		//输出一个十进制的值10
		System.out.println(10);
		//输出一个二进制的值10
		System.out.println(0B10);
		//输出一个八进制的值10
		System.out.println(010);
		//输出一个十六进制的值10
		System.out.println(0X10);
	}
}