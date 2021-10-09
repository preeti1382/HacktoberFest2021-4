import java.util.Scanner;

public class 71A{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str;
		while (n != 0){
			str = sc.nextString();
			n--;
		}
		int len = str.length();
		if(len < 10){
			System.out.println(str);
		}
		else{
			String sub = str.substring(1,len-2);
			int sublen = sub.len();
			str = str.charAt(0) + sublen + str.charAt(len-1);
			System.out.println(str);
		}
	}
}