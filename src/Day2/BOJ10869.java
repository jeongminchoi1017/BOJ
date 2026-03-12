package Day2;

import java.util.Scanner;

public class BOJ10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B); // 몫을 출력
        System.out.println(A%B); // 나머지를 출력
    }
}
