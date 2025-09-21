package oop;

public class basics {
    public static void main(String args[]) {
        // Pen p1 = new Pen();
        // p1.setColor("black");
        // p1.setTip(4);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());
        // p1.setColor("green");
        // System.out.println(p1.getColor());
        // // p1.color = "blue"; // it is not possible now as color is a private
        // property
        // // System.out.println(p1.color);
        // BankAccount myAccount = new BankAccount();
        // myAccount.username = "nafis shahriar";
        // myAccount.setPassword("nafisshshshshs");
        // System.out.println(myAccount);

        // Student nafis = new Student("nafis shahriar");
        // System.out.println(nafis.name);
        // Student s1 = new Student();
        Student s2 = new Student();
        s2.name = "ariq";
        s2.age = 21;
        s2.roll = 26;
        s2.password = "hahaha";
        s2.marks[0] = 1;
        s2.marks[1] = 2;
        s2.marks[2] = 3;
        Student s3 = new Student(s2);
        s3.password = "kakaka";
        s2.marks[2] = 12344;
        for (int i = 0; i < s3.marks.length; i++) {
            System.out.println(s3.marks[i]);
        }
        // Student s4 = new Student("kamal", 33);// error

    }
}

class BankAccount {
    public String username;
    private String password;

    void setPassword(String pass) {
        password = pass;
    }
}

class Pen {
    private String color;
    private int tip;

    int getTip() {
        return tip;
    }

    String getColor() {
        return color;
    }

    void setTip(int newTip) {
        this.tip = newTip;
        // tip = newTip;
    }

    void setColor(String newColor) {
        // this.color = newColor;
        color = newColor;
    }
}

class Student {
    String name;
    int age;
    int roll;
    float parcentage; // cgpa
    String password;
    int marks[];
    // Address add;
    // class Address {
    // String city;
    // }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called.......");
    }

    Student(Student student) {
        marks = new int[3];
        name = student.name;
        age = student.age;
        roll = student.roll;
        for (int i = 0; i < student.marks.length; i++) {
            marks[i] = student.marks[i];
        }

    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    void calculateParcentage(int math, int phy, int chem) {
        parcentage = (math + phy + chem) / 3;
    }
}