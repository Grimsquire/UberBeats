import java.util.HashMap;

public class Assignment {
    String courseName;
    String assignmentName;
    int maxScore;
    //make private?
    HashMap<String, Double> grades = new HashMap<String,Double>();

    //Simple Constructor
    public Assignment (String name, int max) {
        this.assignmentName = name;
        this.maxScore = max;
    }

    //Inputs a studentName as a key, and their score as a value into the grades HashMap.
    public void addScore(String studentName, double score) {
        grades.put(studentName, score);
    }

    //Sums up all scores for the Assignment and finds the average.
    public double calcAvgScore() {
        if (grades.isEmpty()) {
            return -1;
        }
        double sum = 0;
        for (double i : grades.values()) {
            sum += i;
        }
        return ((sum) / grades.size());
    }

    //Checks for a student name from the list to pull the right score.
    public double getScore(String studentName) throws Exception {
        if (grades.containsKey(studentName)) {
            return grades.get(studentName);
        }
        throw new Exception("Didn't find the student!");
    }
}