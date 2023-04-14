package bai_11;

public class SNT {
    public static boolean isSNT(int n) {

        int cout = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                cout++;
            }
        }
        if (cout == 1) {
            return true;
        }
        return false;
    }

}
