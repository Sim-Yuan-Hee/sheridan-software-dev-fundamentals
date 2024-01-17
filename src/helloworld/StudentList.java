/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author My Personal Computer
 */
//public static void main(String[] args)
//{
    public class StudentList 
    {
        public static void main(String[] args)
        {   

            Student anakin = new Student(66, "Anakin");
            Student[] studentList = new Student[3];

            studentList[0] = anakin;
//            Don't skip an index, when adding elements
            studentList[1] = new Student(95, "Biggie Smalls");
            studentList[2] = new Student(95, "Biggie Smalls");
            
            for (Student s:studentList)
            {
                System.out.println(s.getStudentName());
            }
        }
    }