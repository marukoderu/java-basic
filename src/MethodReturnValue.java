public class MethodReturnValue {
    public static void main(String[] args) {

        // Secara default, method tidak menghasilkan value
        // Ubah void ke tipe data lain
        // Menggunakan return keyword untuk mengembalikan nilai
        // Di Java, hanya bisa menghasilkan 1 data
        var a = 10;
        var b = 10;
        var c = sum(a, b);
        System.out.println(c);
        System.out.println(hitung(a, "as", b));

    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
