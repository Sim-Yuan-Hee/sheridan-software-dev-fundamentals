/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//import helloworld.Student;
package helloworld;

/**
 *
 * @author NathanSim
 */
public class PartTimeStudent extends Student
{
//    Student.super();
    private int numOfCourses;

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
    public PartTimeStudent(int sID, String StudentName) {
        super(sID, StudentName);
    }
}
