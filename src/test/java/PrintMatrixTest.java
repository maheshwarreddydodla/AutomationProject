import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrixTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total rows");
		int rows = scanner.nextInt();
		System.out.println("Enter total cols");
		int cols = scanner.nextInt();

		int[][] data = new int[rows][cols];
		System.out.println("Please Enter the matrix data:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i][j] = scanner.nextInt();
			}
		}

//		for(int i=0;i<rows;i++)
//		{
//			for(int j=0;j<cols;j++)
//			{
//				System.out.print(data[i][j]+"\t");
//			}
//			System.out.println();
//		}

//		for(int[] r:data)
//		{
//			for(int x:r)
//			{
//				System.out.print(x+" ");
//			}
//			System.out.println();
//		}
		
//		System.out.println(Arrays.deepToString(data));
		
		Arrays.stream(data).forEach(e->{
			Arrays.stream(e).forEach(j->System.out.print(j+" "));
			System.out.println();
			
		});

	}
}
