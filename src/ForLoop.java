public class ForLoop {
    public static void main(String[] args) {

        // for (init state; condition; post state)
        // init state sekali di eksekusi
        // kondisi selalu cek sebelum perulangan
        // post state dieksekusi setelah akhir perulangan
        // init, cond, post boleh tidak diisi dan akan bernilai true

        // for (;;) -> selalu true

//        var counter = 1;
//
//        for (; counter <= 10;) {
//            System.out.println(counter);
//            counter++;
//        }

//        for (var counter = 1; counter <= 10;) {
//            System.out.println(counter);
//            counter++;
//        }

        for (var counter = 1; counter <= 10; counter++) {
            System.out.println(counter);
        }

    }
}
