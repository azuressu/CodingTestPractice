package org.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.code.MathArray.solution;

class MathArrayTest {

    @Test
    @DisplayName(value = "정답 확인")
    void test1() {
        int [] score = {1, 3, 2, 4, 2};
        int [] answer = solution(score);
        int [] realanswer = {1, 2, 3};

        assert Arrays.equals(answer, realanswer);
    }

    @Test
    @DisplayName(value = "정답 확인")
    void test2() {
        int [] score = {1, 4, 2, 5, 3, 2, 2, 4};
        int [] answer = solution(score);
        int [] realanswer = {1, 2, 3};

        assert Arrays.equals(answer, realanswer);
    }



}