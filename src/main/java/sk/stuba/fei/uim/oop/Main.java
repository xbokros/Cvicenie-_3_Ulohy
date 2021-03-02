package sk.stuba.fei.uim.oop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] listOfStudents = new Student[3];
        Student s1 = new Student();
        Student s2 = new Student(123456,"Jano","Kebab",21);
        Student s3 = new Student(123456,"Adam","Baklazan",22);

        s1.initializeStudent(123456,"Fero","Mrkvicka",21);

        listOfStudents[0] = s1;
        listOfStudents[1] = s2;
        listOfStudents[2] = s3;

        printAllStudents(listOfStudents);
        System.out.println("xxxxxxxxxxxxxxxxxx");
        Arrays.sort(listOfStudents,Student::compareTo);
        printAllStudents(listOfStudents);
        }

        public static void printAllStudents(Student[] listOfStudents){
            for (Student listOfStudent : listOfStudents) {
                listOfStudent.printStudentInfo();
            }
        }
}

