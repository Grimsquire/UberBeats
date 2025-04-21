public class Main {
    public static void main(String[] args) {

        //TODO
        //Need to make sure that objects are in fact being updated when we alter them. I haven't exactly got a good grasp
        //on pass by Object and/or pass by value so i'm not positive that an object is being properly updated after it's
        //put into an ArrayList or Hashmap. Might have to manually 'resubmit' a new object with the changes into those lists.

        //This is all just tests to make sure things are working properly.
        Teacher dube = new Teacher("Dube", "hdh@fsd", 42);
        Student matt = new Student("Matt", "grg@dfdf", 31);
        Student brodie = new Student("Brodie", "fff@sdfsdf", 22);

        dube.createCourse("CIS210");
        dube.createCourse("CIS211");
        dube.createCourse("CIS213");

        matt.enroll("CIS210");
        matt.enroll("CIS213");
        brodie.enroll("CIS210");
        brodie.enroll("CIS213");

        dube.setSelectedCourse("CIS210");
        dube.addAssignment("Homework1", 100);
        dube.selectedCourse.setSelectedAssignment("Homework1");
        dube.addStudentScore("Matt", 50);
        dube.addStudentScore("Brodie", 94);
        System.out.println(dube.displayCourseAvg());

        dube.setSelectedCourse("CIS213");
        dube.addAssignment("Test2", 150);
        dube.selectedCourse.setSelectedAssignment("Test2");
        //TODO
        //addStudentScore stills lets us add a Students score to the hashmap even when they aren't enrolled.
        dube.addStudentScore("Matt", 130);
        dube.addStudentScore("Brodie", 100);

        dube.addAssignment("Homework3", 50);
        dube.selectedCourse.setSelectedAssignment("Homework3");
        dube.addStudentScore("Matt", 40);
        dube.addStudentScore("Brodie", 50);

        System.out.println(dube.displayCourseAvg());
        System.out.println("Average for " + dube.selectedCourse.selectedAssignment.assignmentName + " " + dube.selectedCourse.getAssignmentAvg());
        dube.selectedCourse.setSelectedAssignment("Test2");
        System.out.println("Average for " + dube.selectedCourse.selectedAssignment.assignmentName + " " + dube.selectedCourse.getAssignmentAvg());


        matt.displaySchedule();
        System.out.println();
        System.out.println(matt.getIdNumber());
        System.out.println(brodie.getIdNumber());

        dube.selectedCourse.showStudentRoster();
    }
}