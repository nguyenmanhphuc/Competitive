public class BASE {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 7, 10, 11, 12, 25, 100 };
		for(int i=0; i<1001; ++i){
			System.out.println(lowerBound(arr, i));
		}
		//System.out.println(upperBound(arr, 24));
	}

	public static int upperBound(int[] arr, int value) {
		int right = arr.length - 1;
		int left = 0;
		if (arr[right] < value) {
			return -1;
		}

		while (right != left) {
			int mid = (right + left) >> 1;
			if (arr[mid] >= value) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		if (arr[left] >= value) {
			return left;
		}
		return left + 1;
	}

	public static int lowerBound(int[] arr, int value) {
		int right = arr.length - 1;
		int left = 0;
		if (arr[0] > value) {
			return -1;
		}

		while (right != left) {
			int mid = (right + left + 1) >> 1;
			if (arr[mid] <= value) {
				left = mid;
			} else {
				right = mid - 1;
			}
		}

		if (arr[left] <= value) {
			return left;
		}
		return left - 1;
	}
}
