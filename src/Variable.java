public class Variable {
    public static void main(String[] args) {

        // Java itu bahasa static type
        // Variable hanya bisa nyimpen tipe data yang sama
        // tidak bisa berubah seperti PHP atau JavaScript

        String name;
        name = "Muhammad Raihan Pratama";

        int age = 20;
        String nationality = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(nationality);

        // VAR KEYWORD
        // ! Value harus di inisialisasi langsung
        var name2 = "Riffat";
        var age2 = 12;

        System.out.println(name2);
        System.out.println(age2);

        // FINAL KEYWORD
        // Membuat sebuah variable yang value nya tidak bisa diubah-ubah
        // Istilah lain variabel tipe ini disebut konstan
        final String univ = "POLBAN";
        // univ = "MIT"; <- bakal error

        System.out.println(univ);

    }
}
