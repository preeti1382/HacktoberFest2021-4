import java.util.Scanner;
public class A96{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cont = 1;
		String res = "No";
		for(int i=0 ; i<str.length()-1 ; i++){
			if(str.charAt(i) == str.charAt(i+1)){
				cont+=1;
			}
		}
		if(cont >= 7){
			res = "Yes";
		}
		System.out.println(res);
	}
}