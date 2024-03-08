import java.util.List;

public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private List<Student> studentList;
    private Integer totalStudents;
    
    public String getBlockCode(){
        return blockCode;
    }
    public void setBlockCode(String blockCode){
        this.blockCode = blockCode;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getAdviser(String adviser){
        return adviser;
    }
    public void setAdviser(String adviser){
        this.adviser = adviser;
    }
    public Integer getTotalStudents(){
        return totalStudents;
    }
    public void setTotalStudents(Integer totalStudents){
        this.totalStudents = totalStudents;
    }
    public List<Student> getStudentList(){
        return studentList;
    }
    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }
    

    public String toString() {
        String output = new String();   
    
            output += "Block section: " + blockCode + "\n" +
                  "Description: " + description + "\n" +
                  "Adviser: " + adviser + "\n\n" +
                  "Total Students: " + totalStudents + "\n\n";

    for (Student student: studentList){
        output += student.toString();
        }  return output;        
    }
}