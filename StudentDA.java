import java.io.*;
import java.util.*;

public class StudentDA{
    private ArrayList<Student> studentList;
    private Integer totalStudents;

    public StudentDA(String blockCode) throws FileNotFoundException {
        Scanner studentInfo = new Scanner(
                new FileReader("studentInfo.csv"));
        studentList = new ArrayList<>();
        totalStudents = 0;
        while(studentInfo.hasNext()){
            
            String rowStudent = new String();
            rowStudent = studentInfo.nextLine();

            String[] rowStudentSpecific = new String[4];
            rowStudentSpecific = rowStudent.split(",");

            if(blockCode.equals(rowStudentSpecific[0].trim())){
            Student student = new Student();
            student.setStudentNumber(rowStudentSpecific[1].trim());
            student.setName(rowStudentSpecific[2].trim());
            student.setProgram(rowStudentSpecific[3].trim());
            totalStudents++;

            CourseDA courseDA = new CourseDA(student.getStudentNumber());
            student.setCourseList(courseDA.getCourseList());
            student.setTotalUnits(courseDA.getTotalUnits());
            studentList.add(student);
            }  
        }
        studentInfo.close();
    }
    public ArrayList<Student> getStudentList(){
        return studentList;
    }
    public Integer getTotalStudents(){
        return totalStudents;
    }
}