public class OperasiBoolean {
    public static void main(String[] args) {

        var nilaiAbsen = 90;
        var nilaiAkhir = 80;

        boolean lulusAbsen = nilaiAbsen >= 75;
        boolean lulusAkhir = nilaiAkhir >= 80;

        var lulus = lulusAbsen && lulusAkhir;
        System.out.println(lulus);

    }
}
