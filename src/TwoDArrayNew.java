import java.util.*;
public class TwoDArrayNew {

		public static void main(String[] args){
			
			int a[][];
			a=new int [4][];
			a[0]=new int [1];
			a[1]=new int [2];
			a[2]=new int [3];
			a[3]=new int [1];
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the elements :");
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
						
					a[i][j]=sc.nextInt() ;
				}
			}
			System.out.println("Matrix : \n");
			for(int i=0;i<a.length;i++){
				
				System.out.print("\n");
				for(int j=0;j<a[i].length;j++){
					
					System.out.print(a[i][j]+"\t");
				}
			}
		}	
}
