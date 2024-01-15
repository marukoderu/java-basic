public class MethodVariableArgument {
    public static void main(String[] args) {

        // Kadang kita butuh mengirim data ke method sejumlah data yg tidak pasti
        // Kalo seperti itu, kita akan menggunakan Array sbg parameter method
        // Parameter dengan tipe var argument, hanya bisa ditempatkan di posisi akhir statement
        int[] values = {70, 70, 75, 70, 90};
//        sayCongrats("Raihan", values);
        sayCongrats("Raihan", 80,90,75,70,90);

    }

//    static void sayCongrats(String name, int[] values) {
//        var total = 0;
//        for (var value : values) {
//            total += value;
//        }
//        var finalValue = total / values.length;
//
//        if (finalValue >= 75) {
//            System.out.println("Congrats! You are Passed!");
//        } else {
//            System.out.println("Try Again");
//        }
//    }
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Congrats! You are Passed!");
        } else {
            System.out.println("Try Again");
        }
    }
}
