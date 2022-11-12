import java.util.Scanner;

public class BaekJoon10815 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        int result[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    result[i] = 1;
                    break;
                } else {
                    result[i] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
------------------------------------------------------------------------------------------
