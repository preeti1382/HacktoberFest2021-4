import java.util.Scanner;
import java.util.Arrays;
public class A25{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] a = new int[n];
		int e = 0 , o = 0 , index = 0;
		for(int i=0 ; i <n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i<n ; i++){
			if(a[i]%2 == 0) e++;
			else o++;
		}
		if(e>o){
			for(int i = 0 ;i<n ; i++){
				if(a[i]%2 != 0){
					System.out.println(i+1);
				} 
			}
		}
		else{
			for(int i = 0 ;i<n ; i++){
				if(a[i]%2 == 0){
					 System.out.println(i+1);
				} 
			}	
		}
		
	}
}