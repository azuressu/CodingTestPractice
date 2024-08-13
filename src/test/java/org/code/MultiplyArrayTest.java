package org.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.code.MultiplyArray.solution;

class MultiplyArrayTest {

    @Test
    @DisplayName(value = "행렬 곱셈 정답 확인")
    void test1() {
        int[][]arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][]arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][]answer = solution(arr1, arr2);
        int[][]realanswer = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};

        assert Arrays.deepEquals(answer, realanswer);
    }

}