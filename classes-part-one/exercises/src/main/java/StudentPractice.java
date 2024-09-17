package exercises.classespart1.src.main.java;

import org.launchcode.Student;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student person = new Student("Jeff", 123, 1,4.0);
        String output = person.toString();
        System.out.println(output);
    }
}
