abstract class Question {
    private String questionPrompt;

    public Question(String questionPrompt) {
        this.questionPrompt = questionPrompt;
    }

    public String getQuestionPrompt() {
        return questionPrompt;
    }

    public abstract void displayQuestion();

    public abstract boolean checkAnswer(String, userAnwser);
}
