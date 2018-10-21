package ua.javacourse.labs;

/**
 * Created by Yuliia Tesliuk on 10/21/2018
 */
class Model {
    static final String FIRST_WORD = "hello";
    static final String SECOND_WORD = "world";

    private StringBuilder sentence = new StringBuilder();

    /**
     * Checks the correction of the translation from user, if true - append the sentence
     * @param userInput
     * @param comparingWord
     * @return
     */
    boolean isMatched(String userInput, String comparingWord) {
        if (userInput.equalsIgnoreCase(comparingWord)) {
            sentence.append(userInput).append(" ");
            return true;
        } return false;
    }

    String getSentence() {
        return sentence.toString();
    }
}
