import java.util.Scanner;


class UserMainCode3 {
	
	static int[] sortMergedArrayList(int arr1[], int arr2[])
	{
//		System.out.println(arr1);
		int mergeArray[] = new int[10];
		int k=0;
		int i=0;
		for(i=0; i<5; i++) {
			mergeArray[i] = arr1[k++];
		}
		for(i=0; i<5; i++) {
			mergeArray[k++] = arr2[i];
		}
		
		for(int l=0; l<mergeArray.length; l++) {
			for(int m=l+1; m<mergeArray.length - 1; m++) {
				
				if(mergeArray[l] > mergeArray[m]) {
					int temp = mergeArray[m];
					mergeArray[m] = mergeArray[l];
					mergeArray[l] = temp;
				}
			}
		}
		return mergeArray;
	}
}
public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int result[] = new int[3];
		
		//System.out.println("Enter the numbers:");
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		for(i=0; i<5; i++) {
			
			arr1[i] = sc.nextInt();
			
		}
		for(i=0; i<5; i++) {
			
			arr2[i] = sc.nextInt();
			
		}
		result = UserMainCode3.sortMergedArrayList(arr1, arr2);
		System.out.println(result[2]);
		System.out.println(result[6]);
		System.out.println(result[8]);

	}

}
