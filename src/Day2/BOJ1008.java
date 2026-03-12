package Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextInt();
        double B = scanner.nextInt();

        // double은 소수점 15~16자리 정도

        System.out.println(A/B);

        float C = scanner.nextInt();
        float D = scanner.nextInt();

        // float은 소수점 6~7자리 정도

        System.out.println(C/D);

        //TODO 코딩테스트에서는 웬만하면 float 보다는 double을 쓰는 것이 좋다.
    }
}
