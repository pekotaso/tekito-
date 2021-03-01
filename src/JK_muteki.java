import java.util.Scanner;

public class JK_muteki {
    public static void main(String[] args) {
        // 標準入力
        Scanner scan = new Scanner(System.in);
        // ジャンケン回数
        int JK_times = scan.nextInt();
        // 指の合計
        int JK_fingers = scan.nextInt();
        scan.nextLine();
        // グーチョキパーのパターン
        String GCP = scan.nextLine();

        int fingers_remain = JK_fingers;

        int G_you = 0;
        int C_you = 0;
        int P_you = 0;

        for (char i : GCP.toCharArray()) {
            if (i == 'G') G_you++;
            if (i == 'C') C_you++;
            if (i == 'P') P_you++;
        }

        int max_win = 0;

        for (int i = 0; fingers_remain >= 0; i++) {
            if (fingers_remain % 2 == 0) {
                int P_i = i;
                int C_i = fingers_remain / 2;
                int G_i = JK_times - P_i - C_i;
                if (C_i >= 0 && G_i >= 0) {
                    int win = 0;
                    win += Math.min(P_i, G_you);
                    win += Math.min(G_i, C_you);
                    win += Math.min(C_i, P_you);
                    if (win > max_win) max_win = win;
                }
            }
            fingers_remain -= 5;
        }
        System.out.println(max_win);
    }
}