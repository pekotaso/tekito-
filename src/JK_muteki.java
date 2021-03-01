import java.util.Scanner;

public class JK_muteki {
    public static void main(String[] args) {
        // 標準入力
        Scanner scan = new Scanner(System.in);
        // ジャンケン回数
        int JK_times = scan.nextInt();
        // 自分がジャンケンで出す指の合計
        int JK_fingers = scan.nextInt();
        scan.nextLine();
        // 相手が出すグーチョキパーのパターン
        String GCP = scan.nextLine();

        // 相手が出すグーチョキパ―の数をそれぞれカウントする
        int G_you = 0;
        int C_you = 0;
        int P_you = 0;
        for (char i : GCP.toCharArray()) {
            if (i == 'G') G_you++;
            if (i == 'C') C_you++;
            if (i == 'P') P_you++;
        }

        // 勝利できる最大数
        int max_win = 0;
        // 指の数をカウントする
        int fingers_remain = JK_fingers;

        // パーの最大数から0までループでカウントする
        for (int i = 0; fingers_remain >= 0; i++) {
            // 残りの指の本数がチョキで割り切れる場合のみ、指の合計の条件を満たす
            if (fingers_remain % 2 == 0) {
                // 自分が出すパーの回数
                int P_i = i;
                // 自分が出すチョキの回数
                int C_i = fingers_remain / 2;
                // 自分が出すグーの回数
                int G_i = JK_times - P_i - C_i;
                // グーの回数がゼロ以上のとき指の合計の条件を満たす
                if (G_i >= 0) {
                    int win = 0;
                    // グーで勝つ回数
                    win += Math.min(P_i, G_you);
                    // チョキで勝つ回数
                    win += Math.min(G_i, C_you);
                    // パーで勝つ回数
                    win += Math.min(C_i, P_you);
                    // 最大勝利数と現在の勝利数を比較して現在のほうが大きければ更新
                    if (win > max_win) max_win = win;
                }
            }
            // パーの指の数だけ減算
            fingers_remain -= 5;
        }
        System.out.println(max_win);
    }
}