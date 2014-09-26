import java.util.Scanner;
public class Matriks{
	public static void main(String []args){
		
		Scanner input=new Scanner(System.in);
		
		int i,j,k;
		int[][]A=new int[2][2];
		int[][]B=new int[2][2];
		int[][]Penjumlahan=new int[2][2];
		int[][]Pengurangan=new int[2][2];
		int[][]Perkalian=new int[2][2];
		
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.print("A "+i+"."+j+"= ");
				A[i][j]=input.nextInt();
			}
		}
		System.out.println();
		
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.print("B "+i+"."+j+"= ");
				B[i][j]=input.nextInt();
			}
		}
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				Penjumlahan[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.println("\nA + B\n");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.print(" "+Penjumlahan[i][j]);
			}
			System.out.println();
		}
		
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				Pengurangan[i][j]=A[i][j]-B[i][j];
			}
		}
		System.out.println("\nA - B\n");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.print(" "+Pengurangan[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}