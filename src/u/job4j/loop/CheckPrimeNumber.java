package u.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int n) {
        boolean res = (n > 1); // ? true : false;
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
