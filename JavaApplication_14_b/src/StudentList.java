
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tungi
 */
public class StudentList extends ArrayList<Student> {

    public void addStudent(Student s) {
        this.add(s);
    }
    
    public Student getStudentById(String id){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getId().equals(id))
                return this.get(i);
        }
        return null;
    }
    
    public void printAllPassedStudent(){
        for (Student student : this) {
            if(student.getGpa()>=5){
                System.out.println(student);
            }
        }
    }

}
