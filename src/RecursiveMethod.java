public class RecursiveMethod {
    public static void main(String[] args) {

        // Kemampuan untuk memanggil dirinya sendiri
        System.out.println(factorial(5));
        System.out.println(newFactorial(5));

        loop(10000);

    }

    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    static int newFactorial(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * newFactorial(value - 1);
        }
    }

    // Problem Recursive Method :
    // Jika recursive terlalu dalam, maka akan terjadi error StackOverflow
    // yaitu error dimana stack method terlalu banyak
    static void loop(int value) {
        if (value == 0) {
            System.out.println("END");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
