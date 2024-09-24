import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private int totalQuestions;
    private int correctAnswers;

    public Quiz() {
       questions = new ArrayList<>();
       totalQuestions = 0;
       correctAnswers = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
        totalQuestions++;
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);


        for (Question question : questions) {
            question.displayQuestion();

            if (question instanceof MultipleChoiceQuestion) {
                ((MultipleChoiceQuestion) question).displayOptions();
            } else if (question instanceof CheckboxQuestion) {
                ((CheckboxQuestion) question).displayOptions();
                System.out.println("Select all correct options seperated by commas: ");

            }

            System.out.println("Enter your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println(("Incorrect!"));
            }
            System.out.println();
        }
        scanner.close();
    }
        public void gradeQuiz() {
            System.out.println("You got " + correctAnswers + " out of " + totalQuestions + " correct.");
        }
    }

