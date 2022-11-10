내가 만든것
import java.util.*;
public class Select_Sort{

    public static void main(String []args){

        int array[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                else
                    continue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
/*
기존의 예제 답은 배열의 크기를 주고 가장 작은 함수로 min_index를 선언해주고, 앞의값보다 뒤의값이 작을때만 if문이 돌아가게 하여 함수의 길이가 짧아 보인다
배열을 끝가지 지나가고 가장 작은값을 min_index에 저장해 둔 다음에 맨앞, 작은수부터 값을 확정시키는것이 나랑 달랐다.
*/
===================================================================================================================================================================
기존의 예제 답
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < n; i++) {
            int min_index = i; // 가장 작은 원소의 인덱스 
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            // 스와프
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

