import java.util.*;

public class Main {


    protected static List<Integer> primeNumberGenerator(int number) {

        List<Integer> primeNumbersList = new ArrayList<>();

        for (int i = 2; i <= number; i++) {

            if (isPrime(i))
                primeNumbersList.add(i);
        }

        return primeNumbersList;
    }

    protected static boolean isPrime(int number) {

        boolean flag = true;

        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        System.out.println("Enter an integer number");
        Scanner input = new Scanner(System.in);

        try {
            int number = input.nextInt();
            if (number <= 1) {
                throw new IllegalArgumentException("The given number is not a prime number, nor a composite of prime numbers");
            }

            System.out.println(" the prime numbers smaller or equal to the given number are ");
            System.out.println(primeNumberGenerator(number));
        }

        catch (InputMismatchException e) {

            System.out.println("The given number is not an integer");
        }
    }
}
