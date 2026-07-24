package Array;

public class MultiDimArray {
	public static void main(String[] args) {
		
		int arr[][] = {{12,90,45},{67,34,98},{12,73,48}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
