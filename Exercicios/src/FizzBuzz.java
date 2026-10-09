public class FizzBuzz {

    public static void main(String[] args) {
        int limite = 50;

        for (int x = 1; x <= limite; x++) {

            System.out.print(x);

            if (x % 3 == 0) {
                System.out.print(" Fizz");
            }


            if (x % 5 == 0) {
                System.out.print(" Buzz");
            }

            System.out.println();
        }
    }


}