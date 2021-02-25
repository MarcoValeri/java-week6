public class Student {
    private String firstName;
    private String lastName;
    private int quiz_score;
    private int quiz;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        String name = firstName + " " + lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void addQuizScore(int score) {
        quiz_score = quiz_score + score;
        quiz = quiz + 1;
    }

    public int getTotalScore() {
        return quiz_score;
    }

    public double getAverageScore() {
        double average;
        average = quiz_score / quiz;
        return average;
    }

}