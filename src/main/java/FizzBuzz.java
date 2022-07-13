import java.sql.Array;

public class FizzBuzz {
    public String fizzBuzz(String str) {
        if (str == null) return null;
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
        if (str.startsWith("f")) return "Fizz";
        if (str.endsWith("b")) return "Buzz";

        return str;}


  }





