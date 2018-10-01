/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapThree;

/**
 *
 * @author Frebby
 */
public class ShowStudent {
    public static void main(String[] args){
    Student student = new Student();
    student.setIdNum(12);
    student.setCreditHoursEarned(23);
    student.setPointsEarned(4);
    student.setGradePointAve(77);
    System.out.println(student.getIdNum());
        System.out.println(student.getCreditHoursEarned());
    System.out.println(student.getPointsEarned());
    System.out.println(student.getGradePointAve());

    
    
    
    }
}
