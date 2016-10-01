package fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args)
    {
        for(int i = 1; i < 101; i = i + 1)
        {
            String s = fizzBuzzer(i);
            System.out.println(i + s);
        }
    }

    public static String fizzBuzzer(int i)
    {
        String s = "";
        if(i % 3 == 0)
        {
            s += "Fizz";
        }
        if(i % 5 == 0)
        {
            s += "Buzz";
        }
        return s;
    }
}
