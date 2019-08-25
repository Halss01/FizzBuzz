
public class FizzBuzzTest {

    public static void main(String[] args)
    {
        final String first20Lines = "FizzBuzz\n" +
                "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n";

        final String fizzBuzzOutput = "?";  // <--- Tady prosim doplnit volani tveho kodu

        if (!fizzBuzzOutput.startsWith(first20Lines))
        {
            System.err.println("Je tam chyba!");
            System.exit(1);
        }
    }

}
