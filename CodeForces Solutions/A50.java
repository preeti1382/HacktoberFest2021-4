import java.util.Scanner;
public class A50{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int m = sc.nextInt();
		int n = sc.nextInt();
		int area = m*n;
		System.out.println(area/2);*/
		String s = sc.next();
		long l = s.chars().distinct().count();
		//System.out.println(l);
		if(l%2 != 0) System.out.println("IGNORE HIM!");
		else System.out.println("CHAT WITH HER!");
	}
}