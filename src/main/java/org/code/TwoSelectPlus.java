package org.code;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSelectPlus {

    /* 정수 배열 numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑아
     * 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환하는 solution 함수 완성하기
     * 주의
        * 더했을 때 중복이 되는 경우는 제외해야 함 */

    public static void main(String[] args) {
        int [] numbers = {2, 1, 3, 4, 1};
        int [] result = solution(numbers);
        System.out.println(Arrays.toString(result));
    } // main

    static int[] solution(int [] numbers) {
        // 중복 값 제거를 위한 해시셋 생성
        HashSet<Integer> set = new HashSet<>();

        // 두 수를 선택하는 모든 경우의 수를 반복문으로 구하기 (시간 복잡도 - O(N^2))
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) { // 첫 원소 뒤의 원소들만 구하면 됨
                set.add(numbers[i] + numbers[j]);
            }
        }

        // 해시 셋 값을 오름차순으로 정렬하고 int[] 형태의 배열로 변환해 반환하기 (시간 복잡도 - O(N^2log(N^2)))
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    } // solution

}
