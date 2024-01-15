public class Scope {
    public static void main(String[] args) {

        // Di Java, variable bisa di akses di dalam area dimana ia dibua
        sayHello("Raihan");

    }

    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
            System.out.println(hello);
        }

        System.out.println(hello);
        // System.out.println(hi); ERROR!
    }
}
