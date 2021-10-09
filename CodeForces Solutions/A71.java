import java.util.Scanner;

public class A71{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n+=1;
		String str;
		while (n != 0){
			str = sc.nextLine();
			int len = str.length();
			if(len > 10){
				String sub = str.substring(1,len-2);
				int sublen = sub.length();
				sublen += 1;
				str = str.charAt(0) + String.valueOf(sublen) + str.charAt(len-1);
			}
			System.out.println(str);
			n--;
		}

	}
}