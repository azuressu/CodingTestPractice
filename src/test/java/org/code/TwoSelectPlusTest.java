package org.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.code.TwoSelectPlus.solution;

class TwoSelectPlusTest {

    @Test
    @DisplayName(value = "값 확인")
    void test1() {
        int [] numbers = {5, 0, 2, 7};
        int [] result = solution(numbers);

        assert !Arrays.equals(numbers, result);
    }

    @Test
    @DisplayName(value = "제대로 실행되었는지 확인")
    void test2() {
        int [] numbers = {5, 0, 2, 7};
        int [] result = solution(numbers);
        int [] real = {2, 5, 7, 9, 12};

        assert Arrays.equals(result, real);
    }

    @Test
    @DisplayName(value = "값 확인")
    void test3() {
        int [] numbers = {4, 3, 7, 1, 8, 0, 2};
        int [] result = solution(numbers);

        assert !Arrays.equals(numbers, result);
    }

    @Test
    @DisplayName(value = "제대로 실행되었는지 확인")
    void test4() {
        int [] numbers = {4, 3, 7, 1, 8, 0, 2};
        int [] result = solution(numbers);
        int [] real = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15};

        assert Arrays.equals(result, real);
    }

}