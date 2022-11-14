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
===================정석 정렬이 잘못된곳이 없을경우 최선의 시간 복잡도가 O(N)일수 있도록========================================
가끔 검색해보면 Bubble Sort 의 최선의 경우가 O(N)으로 표기하기도 하고, O(N2) 으로 표기하기도 하는데, 
일반적으로 swap 여부를 판단 할 수 있는 변수를 두지 않고 하는 구현의 경우는 O(N2), swap여부를 판단할 수 있는 변수를 둔 경우 O(N)이라고 보면 된다.
public class Bubble_Sort {
 
	public static void bubble_sort(int[] a) {
		bubble_sort(a, a.length);
	}
	
	private static void bubble_sort(int[] a, int size) {
		
		// round는 배열 크기 - 1 만큼 진행됨 
		for(int i = 1; i < size; i++) {
        
			boolean swapped = false;	
			
			// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size - i; j++) {
				
				/*
				 *  현재 원소가 다음 원소보다 클 경우
				 *  서로 원소의 위치를 교환하고
				 *  비교수행을 했다는 표시로 swapped 변수를 true로 변경한다.
				 */
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
            
			/*
			 * 만약 swap된적이 없다면 이미 정렬되었다는 의미이므로
			 * 반복문을 종료한다. 
			 */
			if(swapped == false) {
				break;
			}
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
