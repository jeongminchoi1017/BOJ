package Day6;

import java.util.Scanner;

public class BOJ2141 {
    public static void main(String[] args) {
        // 100,000 번이면 충분히 1초안에 for문가능
        // 보통 자바에서는 1억번 반복했을 때 1초정도 걸림
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++){
            System.out.println(i);
        }
    }
}
