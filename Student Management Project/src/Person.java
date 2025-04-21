import java.util.ArrayList;

public abstract class Person {
    protected String name;
    protected String email;
    //nextId is assigned to idNumber whenever a Student or Teacher object is created. Inside the constructor for those classes
    //nextId is then incremented by 1, ensuring that no Student or Teacher has the same ID number. Must be static.
    protected static int nextId = 0;
    protected int idNumber;
    protected int age;
    //Creates an object that is used to work on 1 particular Course at a time. This gets around the messy solution of having to
    //pass a String as an argument when calling certain methods to find the correct object to perform that method. e.g. addAssignment in Teacher class.
    protected Course selectedCourse;
    //This ArrayList will hold Course objects so that a student can
    protected ArrayList<Course> schedule = new ArrayList<>();

    //Returns the specific course object that the user specifies.
    protected Course getCourseObj(String courseName) {
        return AvailableCourses.findCourseObj(courseName);
    }

    //Sets 'selectedCourse' so that the user does not have to repeatedly specify which course to use when calling methods.
    protected void setSelectedCourse(String courseName) {
        //TODO
        //Make this capable of handling inputs that don't exist in the list.
        this.selectedCourse = getCourseObj(courseName);
    }

    protected static void displayAvailableCourses() {
        //TODO
        //Prints out all course objects in the AvailableCourses > courseList HashMap.
    }

    protected void displayCourseInfo(Course courseName) {
        //TODO
        //Takes in a String courseName, finds the correct object, and prints all the information of that Course.
    }

    protected abstract void exportCourseGrades(Course courseName);

    //Getters and Setters. No setter for idNumber as that shouldn't change.
    protected String getName() {
        return this.name;
    }
    protected void setName(String nameSet) {
        this.name = nameSet;
    }
    protected String getEmail() {
        return this.email;
    }
    protected void setEmail(String emailSet) {
        this.email = emailSet;
    }
    protected int getIdNumber() {
        return this.idNumber;
    }
    protected int getAge() {
        return this.age;
    }
    protected void setAge(int ageSet) {
        this.age = ageSet;
    }
}
