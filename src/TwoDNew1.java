import java.util.*;
public class TwoDNew1 {
	
		public static void main(String[] args){
			
			Scanner sc=new Scanner(System.in);
			int a[][];
			int b[][];
			
			int c=0;
			int c1=0;
			System.out.println("Enter how many rows u want ");
			int r=sc.nextInt();
			a=new int[r][];
			
			for(int i=0;i<r;i++)
			{
				System.out.println("Enter number of columns for "+i+"row");
				c=sc.nextInt();
				a[i]=new int[c];
			}
			
			System.out.println("Enter how many rows u want ");
			int r1=sc.nextInt();
			b=new int[r1][];
			
			for(int i=0;i<r1;i++)
			{
				System.out.println("Enter number of columns for "+i+"row");
				c1=sc.nextInt();
				b[i]=new int[c1];
			}
			
		
			if(r==r1 && c==c1)
			{
				System.out.println("Enter the elements of first matrix");
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						a[i][j]=sc.nextInt();
					}
				}
				
				System.out.println("Enter the elements of second matrix");
				for(int i=0;i<b.length;i++)
				{
					for(int j=0;j<b[i].length;j++)
					{
						b[i][j]=sc.nextInt();
					}
				}
			}
			else
				System.out.println("Number of rows and columns does not match");
			
			System.out.println("\nElements of first matrix are:");
			for(int i=0;i<a.length;i++)
			{
				System.out.println();
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
			}
			
			System.out.println("\nElements of second matrix are:");
			for(int i=0;i<b.length;i++)
			{
				System.out.println();
				for(int j=0;j<b[i].length;j++)
				{
					System.out.print(b[i][j]+"\t");
				}
			}
			
			//addition logic
			
			double add[][]=null;
			add=new double[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					add[i][j]=a[i][j]+b[i][j];
				}
			}
			
			//display addition
			System.out.println("\nAfter addition elments are:");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.println(add[i][j]+"\t");
				}
			}
			
				}
			
		
}
