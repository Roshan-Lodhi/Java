package practice;
import java.util.concurrent.TimeUnit;

public class TypeLyrics {

    public static void typeLyric(String line, long charDelayMillis) throws InterruptedException {
        for (char c : line.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            TimeUnit.MILLISECONDS.sleep(charDelayMillis);
        }
        System.out.println();
    }

     
    public static void main(String[] args) throws InterruptedException {
        String[] lyrics = {

            " Mein ab kyun hosh main aata nahi? ",
            " Sukoon yeh dil kyun paata nahi? ",
            " Kyun torrun khud se jo thay waaday ",
            " Ke ab yeh ishq nibhaana nahi? ",
            " Mein morrun tum se jo yeh chehra ",
            " Dobara nazar milana nahi "
             
        };

        long[] delays = {1500, 1500, 2000, 1800, 2300};

        for (int i = 0; i < lyrics.length; i++) {
            typeLyric(lyrics[i], 35);
            TimeUnit.MILLISECONDS.sleep(delays[i]);
        }
    }
}
