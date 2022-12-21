package 수학.silver3_4375_1;

/**
 * 이 문제의 핵심은 modula연산을 이해해야 한다.
 * x mod n = (x mod n) mod n
 * 이 공식을 사용해서 값이 커지는 것을 막아야 한다.
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bf.readLine();
            if (line == null) {
                break;
            }
            int n = Integer.parseInt(line);
            int number = 1;
            int digit = 1;
            while (true) {
                if (number % n == 0) {
                    break;
                }
                digit += 1;
                number = number * 10 + 1;
                number %= n;
            }
            System.out.println(digit);
        }
    }
}
