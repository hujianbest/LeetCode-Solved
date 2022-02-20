import java.util.Scanner;

public class OD_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] lamps = new int[count];

        for (int i = 0; i < count; i++) {
            lamps[i] = in.nextInt();
        }

        long result = 0;
        for (int i = 0; i < lamps.length - 1; i++) {
            // 遍历左边
            int leftCover = 0;
            for (int j = 0; j < i + 1; j++) {
                leftCover = Math.max(leftCover, lamps[j] - (i - j) * 100);
                if (leftCover >= 100) {
                    break;
                }
            }

            // 遍历右边
            int rightCover = 0;
            for (int k = i + 1; k < lamps.length; k++) {
                rightCover = Math.max(rightCover, lamps[k] - (k - i - 1) * 100);
                if (rightCover + leftCover >= 100 || rightCover >= 100) {
                    break;
                }
            }
            int gap = 100 - (leftCover + rightCover);
            result += Math.max(gap, 0);
        }
        System.out.println(result);
    }
}
