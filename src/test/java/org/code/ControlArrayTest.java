package org.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.code.ControlArray.solution;
import static org.code.ControlArray.solution2;

class ControlArrayTest {

    @Test
    @DisplayName(value = "중복값 제거 후 내림차순 정렬 다른 것 확인")
    void test1() {
        int [] origin = {2, 1, 1, 3, 2, 5, 4};
        int [] sorted = solution(origin);

        assert !Arrays.equals(origin, sorted);
    }

    @Test
    @DisplayName(value = "중복값 제거 후 내림차순 정렬 내용 동일 확인")
    void test2() {
        int [] origin = {2, 1, 1, 3, 2, 5, 4};
        int [] sorted = solution(origin);
        int [] array = {5, 4, 3, 2, 1};

        assert Arrays.equals(sorted, array);
    }

    @Test
    @DisplayName(value = "중복값 제거 후 내림차순 정렬 내용 동일 확인")
    void test3() {
        int [] origin = {2, 1, 1, 3, 2, 5, 4};
        int [] sorted = solution2(origin);
        int [] array = {5, 4, 3, 2, 1};

        assert Arrays.equals(sorted, array);
    }

}