package triangle;

import java.util.Scanner;

public class triangle{
	public static int sort(int a,int b,int c){
		if(a+b<=c || b+c<=a || a+c<=b){
			System.out.println("你输入的不是三角形");
			return -1;
		}
		else{	
			if(a==b && a!=c) {
				System.out.println("你输入的三角形是等腰三角形");
				return 1;
			}
			
			else if(a==b && b==c && c==a){
				System.out.println("你输入的三角形是等边三角形");
				return 2;
			}
			
			else if(0 == a*a + b*b - c*c){
				System.out.println("你输入的三角形是直角三角形");
				return 3;
			}
			else{
				System.out.println("你输入的三角形是普通三角形");
				return 4;
			}
		}
	}
	
	public static void main(String[] args){
		int a, b, c;
		Scanner sc = new Scanner(System.in); 
		System.out.println("从小到大输入第一个数字");
		a = sc.nextInt(); 
		System.out.println("从小到大输入第二个数字");
		b = sc.nextInt(); 
		System.out.println("从小到大输入第三个数字");
		c = sc.nextInt();
		
		sort(a,b,c);

	}
}