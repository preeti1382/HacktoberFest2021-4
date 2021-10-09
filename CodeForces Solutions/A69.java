import java.util.Scanner;
public class A69{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][3];
		int sum1 = 0 , sum2 = 0 , sum3 = 0;
		for(int i=0 ; i<3 ; i++){
			for(int j=0 ; j<3 ;j++){
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n ; j++){
				sum1 += a[i][0];
				sum2 += a[i][1];
				sum3 += a[i][2];
			}
		}
		if(sum1 == 0 && sum2 == 0 && sum3 == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}
}