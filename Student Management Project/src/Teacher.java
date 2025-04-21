public class Teacher extends Person {
    public Teacher (String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.idNumber = nextId;
        //Increments static variable nextId so that no 2 Student/Teacher objects have the same idNumber.
        ++nextId;
    }

    //Creates a new Course object, sets instructorInfo for that Course to the current Teachers name, and adds it to the AvailableCourses courseList.
    protected void createCourse(String courseName) {
        Course newCourse = new Course(courseName);
        newCourse.instructorInfo = this.name;
        AvailableCourses.courseList.put(courseName, newCourse);
    }

    //Takes the currently selected Course, and calls the addAssignment function to create an Assignment object and add
    //it to the Courses coursework HashMap. Takes assignmentName and maxScore as parameters for the Assignments constructor.
    protected void addAssignment(String assignmentName, int maxScore) {
        this.selectedCourse.addAssignment(assignmentName, maxScore);
    }

    //For the currently selected Assignment, adds a Students name and score to the HashMap which keeps tracks of grades.
    protected void addStudentScore(String studentName, int score) {
        this.selectedCourse.selectedAssignment.addScore(studentName, score);
        //TODO
        //Don't add to studentGrades, update their class grade and add THAT to studentGrades.
        this.selectedCourse.studentGrades.put(studentName, score);
    }

    //Prints out an average score for the current Course.
    protected String displayCourseAvg() {
        double numAvg = this.selectedCourse.getCourseAvg();
        System.out.println(numAvg);
        if (numAvg >= 90) {
            return "A";
        } else if (numAvg >= 80) {
            return "B";
        } else if (numAvg >= 70) {
            return "C";
        } else if (numAvg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    //Prints out an average score for the current Assignment.
    protected String displayAssignmentAvg() {
        double numAvg = this.selectedCourse.getAssignmentAvg();
        System.out.println(numAvg);
        if (numAvg >= 90) {
            return "A";
        } else if (numAvg >= 80) {
            return "B";
        } else if (numAvg >= 70) {
            return "C";
        } else if (numAvg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    //Export a list of Course number and letter grades for each Student to a .txt file.
    protected void exportCourseGrades(Course courseName) {
        //TODO
    }
}
