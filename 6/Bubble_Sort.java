package sort;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 8, 9, 10, 2, 5, 7, 3};
        int temp;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        for (int result : arr) {
            System.out.print(result + " ");
        }
    }
}


