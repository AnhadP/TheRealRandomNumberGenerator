import java.text.SimpleDateFormat;
import java.util.Date;
public class TheRealRandomNumberGenerator {

        public static void main(String[] args) {
            for(int i =0; i < 100; i++) {
                System.out.println(random(0, 100)); //random number range, both inclusive
                try {
                    Thread.sleep(254); //Any random number of milliseconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        }
        public static long random(int start, int end) {
            SimpleDateFormat sdf = new SimpleDateFormat("SSS");
            Date now = new Date();
            String strDate = sdf.format(now);
            long mS = Long.parseLong(strDate);
            //System.out.println(mS);
            return (mS) % (end - start + 1) + start;
        }

    }

