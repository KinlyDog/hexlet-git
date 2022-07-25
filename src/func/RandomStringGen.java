package func;

import java.util.Random;

public class RandomStringGen {
    public static String strGen (int N) {
        Random rand = new Random();

        String s = "";
        for (int i = 0; i < N; i++) {
            s += rand.nextInt(10);
        }

        return String.valueOf(s);
    }
}
