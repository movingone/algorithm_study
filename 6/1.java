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

