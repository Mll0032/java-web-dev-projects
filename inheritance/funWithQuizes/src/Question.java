abstract class Question {
    private String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public void displayQuestion() {
        System.out.println(questionText);
    }

    public abstract boolean checkAnswer(String userAnwser);
}
