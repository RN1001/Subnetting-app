package com.lcc.rai.subnettingapp.Utilties;

public class Scores {

    private int questionScore;
    private int questionCount;

    /**
     * @return questionScore
     */
    public int getQuestionScore() {
        return questionScore;
    }

    /**
     * @return questionCount
     */
    public int GetQuestionCount() {
        return questionCount;
    }

    /**
     * Increments QuestionScore
     */
    public void IncrementScore() {
        this.questionScore += 1;
    }

    /**
     * Decrements QuestionScore
     */
    public void DecrementScore() {
        this.questionScore -= 1;
    }

    /**
     *  counts the number of questions that has been answered, uses composition so each object represents a question, e.g. q1 = 10, q2 = 3.
     */
    public void CountQuestions() {
        this.questionCount += 1;
    }

    /**
     * @return result
     */
    public int CalculateIncorrectQuestions() {
        int result = this.questionCount - this.questionScore;
        return result;
    }

}

