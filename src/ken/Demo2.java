package ken;

import java.util.Scanner;

public class Demo2 {
public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个数");
	int b=sc.nextInt();
	shuChu(b);
}
public static void shuChu(int a){
	
	for(int i=1;i<=a;i++){
		System.out.println(i);
	}
}
}