package 수학.bronze1_2609_최대공약수와최소공배수;

import java.io.*;
import java.util.Arrays;

public class Main {
    // 입출력을 위한 객체
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = Arrays.stream(nums).max().getAsInt();
        int b = Arrays.stream(nums).min().getAsInt();;
        int gcd = calcGcd(a, b);// 최대 공약수 구하기
        int lcm = calcLcm(a, b, gcd);
        bw.append(gcd + "\n").append(String.valueOf(lcm));
        bw.flush();
    }

    // 최소 공배수
    private static int calcLcm(int a, int b, int gcd) {
        return a * b / gcd;
    }

    // 최대 공약수
    private static int calcGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcGcd(b, a%b);
    }

}
