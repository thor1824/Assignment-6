/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thor1
 */
public class Student extends Person
{
    private String education;
    private List<GradeInfo> gradeReport = new ArrayList<>();
    
    public Student(int id, String name, String email, String ed) 
    {
        super(id, name, email);
        this.education = ed;
    }

    public String getEducation() {
        return education;
    }

    public double getGradeAvg() 
    {
        double gradeAvg = 0;
        for (GradeInfo gradeInfo : gradeReport) 
        {
          gradeAvg = gradeAvg + gradeInfo.getGrade();
        }
        return gradeAvg / gradeReport.size();
    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public void addGrade(String subjekt, int grade)
    {
        GradeInfo gradeAndSubjekt = new GradeInfo(subjekt, grade);
        gradeReport.add(gradeAndSubjekt);
    }
    
    @Override
    public String toString() 
    {
        return super.getId() + " " + super.getName() + " " + super.getEmail() + " " + education + " " + getGradeAvg();
    }
    
   
    
    
    
    
    
}
