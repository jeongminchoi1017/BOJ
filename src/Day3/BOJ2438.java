package Day3;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=1; i <=N; i++){ // N번의 반복
            for(int j=1; j<=i; j++){ // 1, 2, 3번 순차적으로
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
