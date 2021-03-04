package gomokunarabe;

import java.util.Scanner;

public class gomokunarabe3 {
    public static void main(String[] args) {
        // 標準入力
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("OOOOO")) {
                System.out.println("O");
                return;
            } else if (line.equals("XXXXX")) {
                System.out.println("X");
                return;
            }
        }
            System.out.println("D");
    }
}