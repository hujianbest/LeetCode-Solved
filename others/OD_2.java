import java.util.PriorityQueue;
import java.util.Scanner;

public class OD_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char[] chars = str.toCharArray();
        PriorityQueue<Character> minHeap = new PriorityQueue<>();

        for (char c : chars) {
            minHeap.add(c);
        }

        int k = Integer.parseInt(in.nextLine());
        int deep = Math.min(k, chars.length);
        Character kMin = null;
        for (int i = 0; i < deep; i++) {
            kMin = minHeap.poll();
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == kMin) {
                System.out.println(i);
                return;
            }
        }
    }
}
