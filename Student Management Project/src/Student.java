public class Student extends Person {
    public Student (String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.idNumber = 10000 + nextId;
        //Increments static variable nextId so that no 2 Student/Teacher objects have the same idNumber.
        ++nextId;
    }

    protected void enroll(String courseName) {
        //Sets the current Course object used.
        setSelectedCourse(courseName);
        if (selectedCourse != null) {
            //Take the given Course and add its name to the Students schedule while also adding the Students nname into the studentRoster for that Course object.
            this.schedule.add(selectedCourse);
            selectedCourse.addStudent(this.name, this.getIdNumber());
        } else {
            //Prints an error if the Course doesn't exist in the AvailableCourses list.
            System.out.println("Error, course doesn't exist.");
        }
    }

    //Prints out all the Courses from the Students schedule ArrayList.
    protected void displaySchedule() {
        System.out.print(this.name + "'s schedule: ");
        for (Course newCourse : schedule) {
            System.out.print(newCourse.courseName + " ");
        }
    }

    //Prints out a Students letter and number grade for the Course provided.
    protected void displayCourseGrade(String courseName) {
        //TODO
    }

    //Prints out all of a Students letter and number grades for each Course.
    protected void displayAllCourseGrades() {
        //TODO
    }

    //Export a Students grades for a given Course to a .txt file.
    protected void exportCourseGrades(Course courseName) {
        //TODO
    }

    protected void exportAllCourseGrades() {
        //TODO
        //Export a students average grade for each course to a .txt file.
    }
}
