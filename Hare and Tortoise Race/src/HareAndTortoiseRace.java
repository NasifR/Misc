// Nasif Rahman
// CSC 221 Hare and Tortoise Race
import java.util.Random;

public class HareAndTortoiseRace {
    public static void main(String[] args) {
        int harePosition = 0;
        int tortoisePosition = 0;
        int finishLine = 70;
        Random random = new Random();
        System.out.println("BANG !!!!! \n" +
                "        AND THEY'RE OFF !!!!!");

        while (harePosition < finishLine && tortoisePosition < finishLine) {

            int tortoiseMove = random.nextInt(100) + 1;

            if (tortoiseMove <= 50) {
                tortoisePosition += 3;
            }
            else if (tortoiseMove <= 70 ) {
                tortoisePosition -= 6;
            }
            else {
                tortoisePosition += 1;
            }

            if (tortoisePosition < 0) {
                tortoisePosition = 0;
            } else if (tortoisePosition > 69) {
                tortoisePosition = 69;
            }

            int hareMove = random.nextInt(100) + 1;

            if (hareMove <= 20){
                //sleep
            }
            else if (hareMove <= 40){
                harePosition += 9;
            }
            else if (hareMove <= 50){
                harePosition -= 12;
            }
            else if (hareMove <= 80){
                harePosition += 1;
            }
            else {
                harePosition -= 2;
            }

            if (harePosition < 0) {
                harePosition = 0;
            } else if (harePosition > 69) {
                harePosition = 69;
            }
            for (int i = 0; i < 70; ++i){
                if (i == tortoisePosition && i == harePosition){
                    System.out.print("OUCH!!!");
                }
                else if (i == harePosition) {
                    System.out.print("H");
                }
                else if (i == tortoisePosition){
                    System.out.print("T");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            if (tortoisePosition == 69 && harePosition == 69) {
                System.out.println("Tortoise (underdog) wins!");
                return;
            }
            else if (harePosition == 69) {
                System.out.println("Hare wins. Yuch.");
                return;
            }
            else if (tortoisePosition == 69) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                return;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}