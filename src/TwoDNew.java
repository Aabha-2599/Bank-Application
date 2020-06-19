import java.util.*;
public class TwoDNew {

		public static void main(String[] args){
			
			int a[][];
			int c;
			Scanner sc=new Scanner(System.in);
			System.out.println("How many rows do you want :");
			int r1=sc.nextInt();
			a=new int [r1][];
			
			for(int i=0;i<r1;i++){
				
				System.out.println("Enter the no of columns for" +i+ "rows");
				c=sc.nextInt();
				a[i]=new int[c];
				
			}
			System.out.println("Enter the elements of matrix ");
			for(int i=0;i<a.length;i++){
				
				for(int j=0;j<a[i].length;j++){
						a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Elements of Matrix :\n");
			for(int i=0;i<a.length;i++){
				
				System.out.println();
				for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"\t");
				}
			}
		}
}
