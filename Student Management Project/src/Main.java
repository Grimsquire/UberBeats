import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int menuSelection;

        //TODO
        //Need to make sure that objects are in fact being updated when we alter them. I haven't exactly got a good grasp
        //on pass by reference and/or pass by value so i'm not positive that an object is being properly updated after it's
        //put into an ArrayList or Hashmap. Might have to manually 'resubmit' a new object with the changes into those lists.

        //This is all just tests to make sure things are working properly.
        Teacher dube = new Teacher("Dube", "hdh@fsd", 42);
        Student matt = new Student("Matt", "grg@dfdf", 31);
        Student brodie = new Student("Brodie", "fff@sdfsdf", 19);

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

        dube.setSelectedCourse("CIS213");
        dube.addAssignment("Test2", 150);
        dube.selectedCourse.setSelectedAssignment("Test2");
        dube.addStudentScore("Matt", 130);
        dube.addStudentScore("Brodie", 100);

        dube.addAssignment("Homework3", 50);
        dube.selectedCourse.setSelectedAssignment("Homework3");
        dube.addStudentScore("Matt", 40);
        dube.addStudentScore("Brodie", 50);

        dube.selectedCourse.setSelectedAssignment("Test2");
        matt.displaySchedule();

        dube.selectedCourse.showStudentRoster();
        matt.displayAllCourseGrades();



        System.out.println("Please input a user ID.");
        int inputID = scnr.nextInt();
        if (inputID < 10001 && inputID > 0) {
            do {
                System.out.println("Please select a menu option:");
                System.out.println("1: Create a new course.");
                System.out.println("2: remove a course.");
                System.out.println("3: Add an assignment to a course.");
                System.out.println("4: Remove an assignment from a course.");
                System.out.println("5: Input a student assignment score.");
                System.out.println("6: Remove a student assignment score.");
                System.out.println("7: Display the average grade for a course.");
                System.out.println("8: Display a specific student grade.");
                System.out.println("9: Export all course grades.");
                System.out.println("10: Exit.");
                menuSelection = scnr.nextInt();
                //These prompts that ask for user input can be placed in the actual methods themselves,
                //such as Teacher.addAssignment. the prompt can be placed there which would save space here.
                //Would also need to make sure that we call selectCourse and selectAssignment when we do it.
                String studentName;
                String courseName;
                String assignmentName;
                int score;
                int maxScore;
                //TODO
                //Find a way to replace Teacher with the specific Teacher object that is calling these functions.
                //Also remove note slashes once implemented.
                scnr.nextLine();
                switch (menuSelection) {
                    case 1:
                        System.out.println("Input a name for the course.");
                        courseName = scnr.nextLine();
//                        Teacher.createCourse(courseName);
                        break;
                    case 2:
                        System.out.println("Input a course to remove.");
                        courseName = scnr.nextLine();
                        //TODO
                        //Define this method in Teacher class.
//                        Teacher.removeCourse(courseName);
                        break;
                    case 3:
                        System.out.println("Input a name for the assignment.");
                        assignmentName = scnr.nextLine();
                        System.out.println("Input a max score for the assignment.");
                        maxScore = scnr.nextInt();
//                        Teacher.addAssignment(assignmentName, maxScore);
                        break;
                    case 4:
                        System.out.println("Input the name of the assignment to remove.");
                        assignmentName = scnr.nextLine();
//                      Teacher.removeAssignment(assignmentName);
                        break;
                    case 5:
                        System.out.println("Input a student name.");
                        studentName = scnr.nextLine();
                        System.out.println("Input a score for the student.");
                        score = scnr.nextInt();
//                        Teacher.addStudentScore(studentName, score);
                        break;
                    case 6:
                        System.out.println("Input a student name.");
                        studentName = scnr.nextLine();
//                        Teacher.removeStudentScore(studentName);
                        break;
                    case 7:
                        //This one either needs to take a course name as a parameter or rework the selectedCourse system.
                        System.out.println("Input the name of the course that you want to display the grades for.");
                        courseName = scnr.nextLine();
                        dube.displayCourseAvg(courseName);
                        break;
                    case 8:
                        System.out.println("Input a student name to display their grade.");
                        studentName = scnr.nextLine();
//                        dube.Course.getStudentGrade(studentName);
                        break;
                    case 9:
                        System.out.println("Input a course to export all course grades.");
                        courseName = scnr.nextLine();
//                        Teacher.exportCourseGrades(courseName);
                        break;
                    case 10:
                        continue;
                    default:
                        System.out.println("Invalid selection.");
                        break;
                }
            } while (menuSelection != 10);
        } else if (inputID > 10000) {
            do {
                System.out.println("Please select a menu option:");
                System.out.println("1: Enroll in a course.");
                System.out.println("2: Drop a course.");
                System.out.println("3: Check a course grade.");
                System.out.println("4: Check all course grades.");
                System.out.println("5: Export my course grades.");
                System.out.println("6: Exit");
                menuSelection = scnr.nextInt();
                //TODO
                //Change Student here to instead get the proper student object and remove note slashes.
                String courseName;
                scnr.nextLine();
                switch (menuSelection) {
                    case 1:
                        System.out.println("Enter a course name to enroll.");
                        courseName = scnr.nextLine();
//                      Student.enroll(courseName);
                        break;
                    case 2:
                        System.out.println("Enter a course name to drop.");
                        courseName = scnr.nextLine();
//                      Student.dropCourse(courseName);
                        break;
                    case 3:
                        System.out.println("Enter a course name to view grade.");
                        courseName = scnr.nextLine();
//                      Student.displayCourseGrade(courseName);
                        break;
                    case 4:
                        System.out.println("Displaying all course grades.");
//                      Student.displayAllCourseGrades();
                        break;
                    case 5:
                        System.out.println("Enter a course name to export grades to a file.");
                        courseName = scnr.nextLine();
//                      Student.exportCourseGrades(courseName);
                        break;
                    case 6:
                        continue;
                    default:
                        System.out.println("Invalid selection.");
                        break;
                }
            } while (menuSelection != 6);
        } else {
            System.out.println("Invalid ID.");
        }
    }
}
