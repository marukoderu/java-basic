public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "C";

//        switch (nilai) {
//            case "A":
//                System.out.println("Amazing");
//                break;
//            case "B":
//                System.out.println("Good");
//                break;
//            case "C":
//                System.out.println("Semangat");
//                break;
//            case "D":
//                System.out.println("Try Again");
//                break;
//            default:
//                System.out.println("Periksa Nilai Anda!");
//        }

        // SWITCH LAMBDA
        // Tidak perlu menggunakan break;
//        switch (nilai) {
//            case "A" -> System.out.println("Amazing");
//            case "B", "C" -> System.out.println("Good");
//            case "D" -> System.out.println("Try Again");
//            default -> System.out.println("Periksa Nilai Anda");
//        };

        // YIELD KEYWORD
        // Mengembalikan nilai pada switch statement
        String ucapan;
        ucapan = switch (nilai) {
            case "A":
                yield "Amazing";
            case "B", "C":
                yield "Good";
            case "D":
                yield "Try Again";
            default:
                yield "Periksa Nilai Anda";
        };

        System.out.println(ucapan);

    }
}
