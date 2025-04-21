import java.util.HashMap;

public class Assignment {
    String courseName;
    String assignmentName;
    int maxScore;
    HashMap<String, Integer> grades = new HashMap<String,Integer>();

    //Simple Constructor
    public Assignment (String name, int max) {
        this.assignmentName = name;
        this.maxScore = max;
    }

    //Inputs a studentName as a key, and their score as a value into the grades HashMap.
    public void addScore(String studentName, int score) {
        grades.put(studentName, score);
    }

    //Sums up all scores for the Assignment and finds the average.
    public double calcAvgScore() {
        //TODO
        //Move Courses method getAssignmentAvg to here for encapsulation sake.
    }

    //Checks for a student name from the list to pull the right score.
    public void getScore(String studentName) {
        System.out.println(grades.get(studentName));
    }
}