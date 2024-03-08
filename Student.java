import java.util.ArrayList;

public class Student {
    private String studentNumber;
    private String name;
    private String program;
    private ArrayList<Course> courseArrayList;
    private Integer totalUnits;

    public String getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public ArrayList<Course> getCourseList(){
        return courseArrayList;
    }
    public void setCourseList(ArrayList<Course> courseArrayList){
        this.courseArrayList = courseArrayList;
    }
    public Integer getTotalUnits(){
        return totalUnits;
    }
    public void setTotalUnits(Integer totalUnits){
        this.totalUnits = totalUnits;
    }

    public String toString(){
        String studentOutput = new String();
        studentOutput += String.format("Student number: " + studentNumber + "\n" +
        "Student name: " + name + "\n" +
        "Program: " + program + "\n" +
        "Total units enrolled: " + totalUnits + "\n");

        //header for courseList
        studentOutput += "\n" + "Course code\t" +
        "Description\t\t" + 
        "Units\t" +
        "Day\t" +
        "Time\n"; 
        
        for(Course course: courseArrayList){
            studentOutput += course;
        }
        studentOutput += "\n";
        return studentOutput;                                                   
    }
} 