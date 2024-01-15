public class TipeDataNumber {
    public static void main(String[] args) {

        // INTEGER
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000000;
        long iniLong2 = 100000000L;

        // FLOATING POINT
        float iniFloat = 10.12F;
        double iniDouble = 10.10;

        // LITERALS NUMBER
        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        // UNDERSCORE
        // hanya untuk pemisah untuk membantu pembacaan
        long balance = 1_000_000_000;

        // ==========================

        // KONVERSI TIPE DATA NUMBER
        // 1. Widening Casting (otomatis) : byte > short > int > float > double
        // 2. Narrowing Casting (manual) : double > float > int > char > short > byte
        byte byteNum = 10;
        short shortNum = byteNum;
        int intNum = shortNum;

        int intNum2 = 1000;
        byte byteNum2 = (byte) iniInt; // warning number overflow

    }
}
