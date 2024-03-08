import java.util.*;
import java.io.*;

public class CourseDA{
    private ArrayList<Course> courseList;
    private Integer totalUnits;

    public CourseDA(String studentNumber) throws FileNotFoundException{
        Scanner courseInput = new Scanner(
            new FileReader("scheduleInfo.csv"));
        courseList = new ArrayList<>();
        totalUnits = 0;

        while(courseInput.hasNext()){
            String rowCourse = new String();
            rowCourse = courseInput.nextLine();

            String[] courseRowSpecific = new String[6];
            courseRowSpecific = rowCourse.split(",");

            if(studentNumber.equals(courseRowSpecific[0])){
                Course course = new Course();

                course.setCourseCode(courseRowSpecific[1].trim());
                course.setDescription(courseRowSpecific[2]);
                course.setUnit(Integer.parseInt(courseRowSpecific[3].trim()));
                course.setDay(courseRowSpecific[4].trim());
                course.setTime(courseRowSpecific[5].trim());

                totalUnits += (Integer.parseInt(courseRowSpecific[3]));

                courseList.add(course);
            }
        }
        courseInput.close();
    }
    public ArrayList<Course> getCourseList(){
        return courseList;
    }
    public Integer getTotalUnits(){
        return totalUnits;
    }
    public void setTotalUnits(Integer totalUnits){
        this.totalUnits = totalUnits;
    }
}