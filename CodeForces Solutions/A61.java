import java.util.Scanner;
public class A61{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String ans = "";
		for(int i = 0 ; i <a.length() ; i++){
			if(a.charAt(i) == b.charAt(i)) ans += 0;
			else ans += 1;
		}
		System.out.println(ans);
	}
}