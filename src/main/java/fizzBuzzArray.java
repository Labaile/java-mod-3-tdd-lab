public class fizzBuzzArray {
    public String[] fizzBuzzArray(String[] str) {
        FizzBuzz fb = new FizzBuzz();
        if (str == null) return null;
        String[] str1 = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            str1[i] = fb.fizzBuzz(str[i]);
        }
        return str1;

    }

}
