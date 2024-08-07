package org.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class ControlArray {

    /* 배열의 중복값을 제거하고, 배열 데이터를 내림차순으로 정렬해서 반환하는 solution 함수 구현하기
    * distinct() 메서드는 시간 복잡도 O(N)을 보장한다.
    * sort() 메서드의 Collections.reverseOrder()은 내림차순 정렬을 구현할 수 있게 하는 인자이다. */

    public static void main(String[] args) {
        int [] origin = {4, 2, 2, 1, 3, 4};
        int [] sorted = solution(origin);
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(sorted));
    }

    static int[] solution(int [] array) {
        // 중복 제거
        Integer [] sorting = Arrays.stream(array).boxed().distinct().toArray(Integer[]::new);
        // 내림차순 정렬
        Arrays.sort(sorting, Collections.reverseOrder());
        // 배열로 변환 후 반환
        return Arrays.stream(sorting).mapToInt(Integer::intValue).toArray();
    }

    static int[] solution2(int [] array) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        // 중복 제거 (O(N))
        for (int num : array) {
            set.add(num);
        }

        int [] sorting = new int[set.size()];
        // 다시 정렬 (O(NlogN))
        for (int i=0; i<sorting.length; i++) {
            sorting[i] = set.pollFirst();
        }

        return sorting;
    }
}
