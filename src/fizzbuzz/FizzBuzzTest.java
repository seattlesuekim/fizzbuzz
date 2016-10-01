package fizzbuzz;
import java.util.ArrayList;
import java.util.function.Supplier;

public class FizzBuzzTest
{
    public static void main(String[] args)
    {
        ArrayList<Supplier<Boolean>> tests = new ArrayList<>();
        tests.add(() -> FizzBuzz.fizzBuzzer(2).equals(""));
        tests.add(() -> FizzBuzz.fizzBuzzer(3).equals("Fizz"));
        tests.add(() -> FizzBuzz.fizzBuzzer(5).equals("Buzz"));
        tests.add(() -> FizzBuzz.fizzBuzzer(15).equals("FizzBuzz"));

        for(int i = 0; i < tests.size(); i += 1) {
            System.out.println("Test " + (i+1) + ": " + tests.get(i).get());
        }
    }
}
