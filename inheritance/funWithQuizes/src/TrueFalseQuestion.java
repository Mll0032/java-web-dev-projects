public class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    public TrueFalseQuestion(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println("1: True");
        System.out.println("2: False");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        boolean userBooleanAnswer;

        if (userAnswer.equalsIgnoreCase("True") || userAnswer.equals("1")) {
            userBooleanAnswer = true;
        } else if (userAnswer.equalsIgnoreCase("false") || userAnswer.equals("2")) {
            userBooleanAnswer = false;
        } else {
            System.out.println("Invalid input. Please enter 'True/False' or '1/2'");
            return false;
        }
        return userBooleanAnswer == correctAnswer;
    }
}
