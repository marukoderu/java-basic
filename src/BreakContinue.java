public class BreakContinue {
    public static void main(String[] args) {

        // Break di Loop untuk memberhentikan loop secara keseluruhan
        // Continue menghentikan loop saat ini lalu lanjut ke next loop

//        var counter = 1;
//        while (true) {
//            System.out.println("Loop : " + counter);
//            counter++;
//
//            if (counter > 10) {
//                break;
//            }
//        }

        for (int counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 0) {
                continue;
            }

            System.out.println("Angka Ganjil : " + counter);
        }

    }
}
