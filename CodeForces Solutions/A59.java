import java.util.Scanner;
import java.io.*;
public class A59{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int upper = 0;
		int lower = 0;
		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
		}
		if(upper > lower) str = str.toUpperCase();
		else str = str.toLowerCase();
		System.out.println(str);
	}
}