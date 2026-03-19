package Day9;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){ // 입력할 때 다음값이 있느냐?
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);
        }
    }
}
