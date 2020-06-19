import java.util.*;
public class TwoDArray {

		public static void main(String[] args){
			
			int a[][];
			a=new int [3][3];
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the elements :");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
						
					a[i][j]=sc.nextInt() ;
				}
			}
			
			System.out.println("Matrix : \n");
			for(int i=0;i<3;i++){
				
				System.out.print("\n");
				for(int j=0;j<3;j++){
					
					System.out.print(a[i][j]+"\t");
				}
			}
		}
}
