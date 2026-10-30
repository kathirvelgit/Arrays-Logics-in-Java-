public class Main {
    public static void main(String[] args) {

        // 1. Array + Iteration

        // int[] marks = { 40, 50, 60, 90, 25 };

        // int Highest = marks[0];
        // int Lowest = marks[0];
        // int Sum = 0;

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);

        // if (marks[i] > Highest) {
        // Highest = marks[i];
        // }

        // if (marks[i] < Lowest) {
        // Lowest = marks[i];
        // }

        // Sum += marks[i];

        // }

        // double Average = (double) Sum / marks.length;

        // System.out.println("Highest Mark " + Highest);
        // System.out.println("Lowest Mark " + Lowest);
        // System.out.println("Average Mark " + Average);
        // }

        // 2. Enhanced For Loop

        // int[] marks = { 40, 50, 60, 90, 25 };

        // for(int mark : marks){
        // System.out.println(mark);
        // }

        // 3. Multidimensional Array

        // int[][] marks = {
        // { 80, 75, 90 },
        // { 65, 70, 72 },
        // { 95, 88, 91 }
        // };

        // for(int i = 0; i < marks.length; i++){

        // int total = 0;

        // for(int j = 0; j < marks[i].length; j++){
        // System.out.print(marks[i][j] + " ");
        // total += marks[i][j];
        // }
        // System.out.println();
        // System.out.println("Student " + (i + 1 ) + " Total " + total);
        // }


        // 4. Jagged Array
        // int[][] marks = new int[3][];

        // marks[0] = new int[2];
        // marks[1] = new int[3];
        // marks[2] = new int[4];

        // marks[0][0] = 10;
        // marks[0][1] = 20;

        // marks[1][0] = 30;
        // marks[1][1] = 40;
        // marks[1][2] = 50;

        // marks[2][0] = 60;
        // marks[2][1] = 70;
        // marks[2][2] = 80;
        // marks[2][3] = 90;

        // for(int i = 0; i < marks.length; i++){
        //     for(int j = 0; j < marks[i].length; j++){
        //         System.out.print(marks[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // 5. Array of Objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.id = 1;
        s1.name = "Kathir";
        s1.mark = 80;

        s2.id = 2;
        s2.name = "Priya";
        s2.mark = 90;

        s3.id = 3;
        s3.name = "Dia";
        s3.mark = 100;

        s4.id = 4;
        s4.name = "Velu";
        s4.mark = 50;

        s5.id = 5;
        s5.name = "Vikram";
        s5.mark = 20;

        Student[] students = { s1, s2, s3, s4, s5 };

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                    students[i].id + ". " + students[i].name + " - " + students[i].mark);
        }

        Student highest = students[0];

        for (int i = 1; i < students.length; i++) {

            if (students[i].mark > highest.mark) {
                highest = students[i];
            }
        }

        System.out.println("Highest Mark Student:");
        System.out.println(
                highest.id + ". " + highest.name + " - " + highest.mark);

    }
}

// 5. Array of Objects
class Student {

    int id;
    String name;
    int mark;
}
