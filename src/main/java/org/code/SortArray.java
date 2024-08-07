package org.code;

import java.util.Arrays;

public class SortArray {

    /* Arrays.sort() 메소드는 O(NlogN) 시간 복잡도를 가진다.
    *  데이터 100,000 개를 오름차순으로 정렬하는 데 버블 정렬은 1초가 걸렸지만, sort() 메소드는 0.1초도 걸리지 않는다.
    *  sort() API의 정렬 알고리즘은 Dual-Pivot QuickSort 혹은 Tim-Sort 이다. */

    public static void main(String[]args) {
        int [] origin = {4, 2, 3, 1, 5};
        int [] sorted = solution(origin);
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(sorted));
    }

    static int[] solution(int[] array) {
        int[] clone = array.clone();
        Arrays.sort(clone);
        return clone;
    }
}
