

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++)
            System.out.println(FizzBuzz(i));
    }

    public static String FizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0)
            return "Fizz Buzz";
        else if (i % 5 == 0)
            return "Buzz";
        else if (i % 3 == 0)
            return "Fizz";
        else if (i % 7 == 0)
            return String.valueOf(i) + " - multiple of seven";
        else
            return String.valueOf(i);
    }
}