import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/***
 * 퀵정렬
 */

class Boj_2752_5 {

	private static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		rPivotSort(arr, 0, arr.length - 1);

		for (int str : arr) {
			System.out.print(str + " ");
		}
	}

	private static void rPivotSort(int[] arr, int low, int high) {

		if (low >= high) {
			return;
		}
		int pivot = partition(arr, low, high);

		rPivotSort(arr, low, pivot - 1);
		rPivotSort(arr, pivot + 1, high);
	}

	private static int partition(int[] arr, int left, int right) {
		int low = left;
		int high = right;
		int pivot = arr[right];

		while (low < high) {
			while (arr[low] < pivot && low < high) {
				low++;
			}
			while (arr[high] >= pivot && low < high) {
				high--;
			}

			swap(arr, low, high);
		}

		swap(arr, right, high);
		return high;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}