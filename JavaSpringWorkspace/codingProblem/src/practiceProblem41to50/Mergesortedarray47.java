package practiceProblem41to50;

public class Mergesortedarray47 {

	public static void main(String[] args) {

		System.out.println("Welcome To Merging Sorted Array \n");
		int[] Arr1 = ArrayUtility.inputArray();
		int[] Arr2 = ArrayUtility.inputArray();

		int[] Mer = merge(Arr1, Arr2);

		ArrayUtility.displayArray(Mer);
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int newSize = arr1.length + arr2.length;
		int[] newArr = new int[newSize];

		int i = 0, j = 0, k = 0;

		while (i < arr1.length || j < arr2.length) {

			if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {

				newArr[k] = arr1[i];
				i++;
				k++;

			} else {

				newArr[k] = arr2[j];
				k++;
				j++;
			}
		}

		return newArr;
	}

}
