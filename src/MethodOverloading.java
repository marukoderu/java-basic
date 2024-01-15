public class MethodOverloading {
    public static void main(String[] args) {

        // Kemampuan untuk membuat method dengan nama yang sama lebih dari sekali
        // Syarat : data parameter harus berbeda
        sayHello("Raihan", "Pratama");

    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Good Morning " + firstName + " " + lastName);
    }
}
