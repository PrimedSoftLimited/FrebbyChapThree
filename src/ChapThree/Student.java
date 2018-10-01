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
public class Student {
    int idNum;
    int creditHoursEarned;
    double pointsEarned;
    double gradePointAve;

    public Student() {
        this.idNum = 999;
        this.creditHoursEarned = 3;
        this.pointsEarned = 12;
        this.gradePointAve = 4.0;
    }
                

    public void setCreditHoursEarned(int creditHoursEarned) {
        this.creditHoursEarned = creditHoursEarned;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void setPointsEarned(double pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public void setGradePointAve(double average) {
        average = pointsEarned / creditHoursEarned;
    this.gradePointAve = average;
    }

    public int getIdNum() {
        return idNum;
    }

    public int getCreditHoursEarned() {
        return creditHoursEarned;
    }

    public double getPointsEarned() {
        return pointsEarned;
    }

    public double getGradePointAve() {
        return gradePointAve;
    }



}


