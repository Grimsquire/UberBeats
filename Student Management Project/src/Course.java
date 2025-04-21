import java.util.HashMap;

public class Course {
    public Assignment selectedAssignment;
    public String courseName;
    public String courseDescription;
    public String meetingTime;
    public int roomNumber;
    public String instructorInfo;
    //HashMaps store the current Students, their current class grades, and Assignment objects respectively.
    public HashMap<String, Integer> studentRoster = new HashMap<>();
    public HashMap<String, Integer> studentGrades = new HashMap<>();
    public HashMap<String, Assignment> coursework = new HashMap<>();

    //Simple Constructor
    public Course (String courseName) {
        this.courseName = courseName;
        this.courseDescription = "TBD";
        String meetingTime = "1:30PM - 3:30PM";
        String roomNumber = "3143";
    }

    //Searches the coursework HashMap for assignmentName and returns the corresponding Assignment object.
    public Assignment findAssignmentObj(String assignmentName) {
        return coursework.get(assignmentName);
    }

    //Sets the selectedAssignment as the one returned by the findAssignmentObj method.
    public void setSelectedAssignment(String assignmentName) {
        this.selectedAssignment = this.findAssignmentObj(assignmentName);
    }

    //Creates a new Assignment object and adds it to the coursework HashMap. The assignmentName and maxScore parameters
    //are used in the constructor for a new Assignment, and assignmentName is also used as a key to find the Assignment object.
    public void addAssignment(String assignmentName, int maxScore) {
        Assignment classwork = new Assignment(assignmentName, maxScore);
        classwork.courseName = this.courseName;
        coursework.put(assignmentName, classwork);
    }

    //Takes a studentName as a key and adds studentID to the studentRoster HashMap. These parameters
    //are actually defined by this.____ when called by a Students enroll method.
    public void addStudent(String studentName, int studentID) {
        studentRoster.put(studentName,studentID);
    }

    //Finds the average grade from all Students and finds what the average grade is for the Course.
    public double getCourseAvg() {
        double sum = 0;
        for (int grade : studentGrades.values()) {
            sum += grade;
        }
        return (sum / studentGrades.size());
    }

    //Finds the average grade from all Students and finds what the average grade is for the selectedAssignment.
    public double getAssignmentAvg() {;
        double sum = 0;
        for (int grade : selectedAssignment.grades.values()) {
            sum += grade;
        }
        return (sum / selectedAssignment.grades.size());
    }

    //Simple print out of all keys (i.e. studentName) from the studentRoster HashMap.
    public void showStudentRoster() {
        System.out.println(studentRoster.keySet());
    }

    //Getters and Setters
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    public String getMeetingTime() {
        return meetingTime;
    }
    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getInstructorInfo() {
        return instructorInfo;
    }
    public void setInstructor(String instructor) {
        this.instructorInfo = instructorInfo;
    }
}
