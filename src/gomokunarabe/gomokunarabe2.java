package gomokunarabe;

import java.util.Scanner;

public class gomokunarabe2 {
    public static void main(String[] args) {
        // 標準入力
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        if (line.equals("OOOOO")) {
            System.out.println("O");
        } else if (line.equals("XXXXX")) {
            System.out.println("X");
        } else {
            System.out.println("D");
        }
    }
}