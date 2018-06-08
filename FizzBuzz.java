
import java.util.*;


public class FizzBuzz {
    static Scanner scan = new Scanner(System.in);
    static Random r = new Random();
    static int startingNum, endingNum;



    public static void main(String[] args) {
        FizzBuzz();

    }

    public static void FizzBuzz() {

        startingNum = 1 + r.nextInt(100);
        endingNum = 1 + r.nextInt(100);


        int value = endingNum - startingNum;

        if (startingNum == endingNum) {
            System.out.println(startingNum);
            System.out.println(endingNum);
            System.out.println("Shazam!");

            // if start & last number are last tha 10 print won't take long
        } else if (value < 10) {
            System.out.println("This won't take long!");
        }

        for (int i = startingNum; i < endingNum; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else if (i % 7 == 0){
                System.out.println(i + " -multiple of seven ");

            } else {
                System.out.println(i);


            }
        }
    }
}
