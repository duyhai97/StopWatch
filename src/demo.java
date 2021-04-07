import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
public class demo {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();

        int[] array = new int[100000];

        for (int i = 0; i < 10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 1000);
            array[i] = randomNum;
        }




        boolean swapped = false;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;


            for ( int j = 0; j < array.length - 1 - i; j++) {


                if (array[j] > array[j + 1]) {
                     int  temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;

                }
            }

            if (!swapped) {
                break;
            }


        }
        time.stop();
        System.out.println( "tong thoi gian la: " + time.getElapsedTime() + "milis");


    }
}
