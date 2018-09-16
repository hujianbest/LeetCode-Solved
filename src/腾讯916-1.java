import java.math.BigInteger;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(LCM(n));
    }

    public static BigInteger LCM(int n) {
    	BigInteger ans = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            int tmp = 1;
            if (issushu(i)) {
                while (tmp * i <= n) {
                    tmp *= i;
                }
            }
            ans = ans.multiply(BigInteger.valueOf(tmp));
        }
        return ans;
    }

    public static boolean issushu(int n) {
        if (n == 2 || n == 1)
			return true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
    }
}