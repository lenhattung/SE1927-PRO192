/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Tester {

    public static void main(String[] args) {

        Student s1 = new Student("SE001", "Bac Bling", 10);
        Student s2 = new Student("SE002", "Hoa Minzy", 9);
        Student s3 = new Student("SE003", "Xuan Hinh", 8);
        Student s4 = new Student("SE004", "Tuan Cry", 7);
        Student s5 = new Student("SE005", "Nguyen Van A", 4);
        Student s6 = new Student("SE001", "Bac Bling", 10);

        StudentList se1927 = new StudentList();
        se1927.addStudent(s1);
        se1927.addStudent(s2);
        se1927.addStudent(s3);
        se1927.addStudent(s4);
        se1927.addStudent(s5);
        se1927.addStudent(s1);

        System.out.println(se1927.getStudentById("SE004"));
        System.out.println(se1927.getStudentById("SE0041"));
        se1927.printAllPassedStudent();
    }

}
