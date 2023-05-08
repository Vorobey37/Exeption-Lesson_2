public class try_catch_examples {
    public static void main(String[] args) {
        int number = 1;
        String test = "Привет!";

        try {
            //number = 10/0;
            test = null;
            System.out.println(test.length());
            number = 10/0;
            //System.out.println(test.length());

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!!!");
        } catch (NullPointerException e) {
            System.out.println("У null нет длины!!!");
        }

        System.out.println(number);
        System.out.println(test);
    }
}
