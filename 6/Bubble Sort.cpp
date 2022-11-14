#include <stdio.h>

int main(void) {
	int i, j, tab;
	int array[10] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	
	for(i = 0; i < 9; i++) {
		for(j = 0; j < 9 - i; j++) {
			if(array[j] > array[j+1]) {
				tab = array[j];
				array[j] = array[j+1];
				array[j+1] = tab;
			}
		}
	}
	for(i = 0; i < 10; i++){ 
		printf("%d", array[i]);
	}
	return 0;
}

//선택정렬보다 더 느림 O(N^2), 실제 수행시간 가장 김
//총 3개의 명령어를 사용해서 컴퓨터가 작업해야할 양이 많음.(비 효율적)
