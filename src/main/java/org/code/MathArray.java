package org.code;

import java.util.ArrayList;
import java.util.Arrays;

public class MathArray {

    /* 1번 수포자가 찍는 방식 : 1, 2, 3, 4, 5 ...
    *  2번 수포자가 찍는 방식 : 2, 1, 2, 3, 2, 4, 2, 5
    *  3번 수포자가 찍는 방식 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
    *  1번 문제부터 마지막 문제까지 정답이 순서대로 저장된 배열 answer가 주어졌을 때
    *  가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 반환하도록 solution() 함수 작성
    *  가장 높은 점수를 받은 사람이 여럿이라면 반환 값을 오름차순으로 정렬 */

    public static int[] solution(int [] answers) {
        // 수포자들의 찍기 패턴
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 수포자들의 점수를 저장할 배열
        int[] scores = new int[3];

        // 각 수포자의 패턴과 정답이 얼마나 일치하는지 확인
        for (int i=0; i<answers.length; i++) {
            for (int j=0; j<pattern.length; j++) {
                /* 정답 패턴의 길이가 수포자의 답안 길이보다 긴 경우,
                   정답 패턴의 처음 데이터와 다시 비교할 수 있도록 나머지 연산자 사용 */
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                } // if
            } // for
        } // for

        // 가장 높은 점수 저장
        int maxScore = Arrays.stream(scores).max().getAsInt();

        // 가장 높은 점수를 가진 수포자들의 번호를 찾아 리스트에 담음
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i=0; i<scores.length; i++) {
            if (scores[i] == maxScore) answer.add(i+1);
        } // for

        return answer.stream().mapToInt(Integer::intValue).toArray();
    };

    public static void main(String[] args) {
        int [] score = {1, 2, 3, 4, 5};
        int [] answer = solution(score);

        System.out.println("배열 : " + Arrays.toString(answer));
    }
}
