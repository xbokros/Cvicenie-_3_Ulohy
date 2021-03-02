package sk.stuba.fei.uim.oop;


public class Student implements Comparable<Student>{
    private int id;
    String firstName;
    private String lastName;
    private int age;

    public Student(){

    }

    public Student(int id, String firstName, String lastName, int age){
        initializeStudent(id,firstName,lastName,age);
    }

    public void initializeStudent(int id, String firstName, String lastName, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printStudentInfo(){
        System.out.println("Krstne meno : " + this.firstName + "\n" + "Priezvisko : "
                            + this.lastName + "\n" + "ID : " + this.id + "\n" + "Vek : " + this.age + "\n------------------");
    }

    @Override
    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }
}
