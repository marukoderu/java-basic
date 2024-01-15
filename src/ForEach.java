public class ForEach {
    public static void main(String[] args) {

        // DIgunakan untuk mengakses seluruh data di Array
        String[] students = {
                "Raihan", "Andi", "Budi"
        };

        // for (int i = 0; i < students.length; i++) {
        //    System.out.println(students[i]);
        // }

        for (var student : students) {
            System.out.println(student);
        }

    }
}
