package triangle;

import java.util.Scanner;

public class triangle{
	public static int sort(int a,int b,int c){
		if(a+b<=c || b+c<=a || a+c<=b){
			System.out.println("������Ĳ���������");
			return -1;
		}
		else{	
			if(a==b && a!=c) {
				System.out.println("��������������ǵ���������");
				return 1;
			}
			
			else if(a==b && b==c && c==a){
				System.out.println("��������������ǵȱ�������");
				return 2;
			}
			
			else if(0 == a*a + b*b - c*c){
				System.out.println("���������������ֱ��������");
				return 3;
			}
			else{
				System.out.println("�����������������ͨ������");
				return 4;
			}
		}
	}
	
	public static void main(String[] args){
		int a, b, c;
		Scanner sc = new Scanner(System.in); 
		System.out.println("��С���������һ������");
		a = sc.nextInt(); 
		System.out.println("��С��������ڶ�������");
		b = sc.nextInt(); 
		System.out.println("��С�����������������");
		c = sc.nextInt();
		
		sort(a,b,c);

	}
}