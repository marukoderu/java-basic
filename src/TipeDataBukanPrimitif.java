public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        // Primitif : number, char, boolean, float, double | selalu punya default value

        // String : tipe data object
        // Ciri tipe data bukan primitif:
        // 1. Saat tidak ada value, default value nya null
        // 2, Bisa memiliki method/function

        // Representasi Tipe Data Primitif
        // byte     : Byte (non)
        // short    : Short
        // int      : Int
        // long     : Long
        // float    : Float
        // double   : Double
        // char     : Character
        // boolean  : Boolean

        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Byte iniByte = null;
        iniByte = 10;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        // KONVERSI PRIMITIF - NON
        int iniInt = 100;
        Integer iniInt2 = iniInt;

        // ini intPrimitif = intObject
        // short shortPrimitif = shortObject.shortValue();
        // long longPrimitif = longObject.longValue();
        // float floatPrimitif = floatObject.floatValue();

        // Long amount = 1000000L;
        // amount.shortValue();

        System.out.println(iniInt2);


    }
}
