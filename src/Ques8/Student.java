package Ques8;

public class Student {
    String name;
    static String lastName;                     // static variable
    int rollNo;

    // static counter to set unique roll no

    static int counter = 100;

    public Student(String name)
    {
        this.name = name;

        this.rollNo = setRollNo();
    }

    // getting unique rollNo
    // through static variable(counter)
    static int setRollNo()
    {
        counter++;
        return counter;
    }

    // static method
    static void setLastName(){
        lastName = "Cameron";
    }

    // instance method
    void getStudentInfo()
    {
        System.out.println("FirstName : " + this.name);
        System.out.println("lastName : " + lastName);     // accessing static variable
        System.out.println("rollNo : " + this.rollNo);
    }


    //Driver class

    public static void main(String[] args)
    {
        // calling static method
        // without instantiating Student class

        Student.setLastName();
        Student s1 = new Student("Alex");
        Student s2 = new Student("Lucy");

        s1.getStudentInfo();
        s2.getStudentInfo();

    }
}
