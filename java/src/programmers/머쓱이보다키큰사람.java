package programmers;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {
        int solution = solution(new int[]{149, 180, 192, 170}, 167);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                .filter(h -> h > height)
                .count();
    }
}
