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
/*
완전 탐색으로 풀려하였지만 시간초과로 인해서 이탐색에 대해 알아본후 따라 코딩했다
*/
------------------------------------------------------------------------------------------
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon10815 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n, m;
    static int arr[];

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (binarySearch(num)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.close();
        br.close();
        }
    private static boolean binarySearch (int num) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int mid = arr[middle];

            if (num < mid) {
                right = middle - 1;
            } else if (num > mid) {
                left = middle + 1;
            } else return true;
        }
        return false;
    }
}
