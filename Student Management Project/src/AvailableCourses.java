import java.util.HashMap;

public class AvailableCourses {
    //Stores all created Course objects in a hashmap with Course.name as a key.
    static HashMap<String, Course> courseList = new HashMap<>();

    //Takes in a String courseName and uses that as a key to search the HashMap courseList and return the corresponding Course object.
    public static Course findCourseObj(String courseName) {
        return courseList.get(courseName);
    }
}
