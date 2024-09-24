import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for (Question question : questions) {
            question.displayQuestion();
            System.out.println("Enter your answer: ");

            String userAnswer = scanner.nextLine();
        }

        System.out.println("You scored: " + score + "/" + questions.size());

    }
}

