package org.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.code.SortArray.solution;

class SortArrayTest {

    @Test
    @DisplayName(value = "기존 배열과 다른지 확인")
    void test1() {
        int [] origin = {1, -5, 2, 4, 3};
        int [] sorted = solution(origin);

        assert !Arrays.equals(origin, sorted);
    }

    @Test
    @DisplayName(value = "정렬이 되었는지 확인")
    void test2() {
        int [] origin = {1, -5, 2, 4, 3};
        int [] sorting = {-5, 1, 2, 3, 4};
        int [] sorted = solution(origin);

        assert Arrays.equals(sorting, sorted);
    }

    @Test
    @DisplayName(value = "기존 배열과 다른지 확인2")
    void test3() {
        int [] origin = {-7, 1, 0, 30, 26, -8, 13, 9, 4, 3};
        int [] sorted = solution(origin);

        assert !Arrays.equals(origin, sorted);
    }

    @Test
    @DisplayName(value = "정렬이 되었는지 확인2")
    void test4() {
        int [] origin = {-7, 1, 0, 30, 26, -8, 13, 9, 4, 3};
        int [] sorting = {-8, -7, 0, 1, 3, 4, 9, 13, 26, 30};
        int [] sorted = solution(origin);

        assert Arrays.equals(sorting, sorted);
    }


}