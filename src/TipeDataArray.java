public class TipeDataArray {
    public static void main(String[] args) {

        // Berisikan kumpulan data dengan tipe data yang sama
        // Jumlah data nya tidak bisa berubah setelah pertama kali dibuat

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Muhammad";
        arrayString[1] = "Raihan";
        arrayString[2] = "Pratama";

        System.out.println(arrayString[1]);

        // ARRAY INITIALIZER
        int[] arrayInt = new int[] {
                10, 20, 30, 40, 50
        };

        long[] arrayLong = {
                10, 20, 30, 40, 50
        };

        System.out.println(arrayInt[2]);
        System.out.println(arrayLong[2]);

        // OPERASI DI ARRAY
        System.out.println(arrayInt.length);

        // ARRAY DI DALAM ARRAY
        String[][] students = {
                {"Raihan", "Pratama"},
                {"Andi", "Mahari"},
                {"Kevin"}
        };

        System.out.println(students[0][0]);
        System.out.println(students[0][1]);

    }
}
