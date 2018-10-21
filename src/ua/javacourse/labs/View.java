package ua.javacourse.labs;

/**
 * Created by Yuliia Tesliuk on 10/21/2018
 */
class View {
    static final String INTRODUCTION = "Давай попробуем поприветствовать этот мир на английском!";
    static final String FIRST_REQUEST = "Для начала, как переводится слово \"здравствуй\"? ";
    static final String SECOND_REQUEST = "Отлично! А как на счет слова \"мир\"? ";
    static final String WRONG_ANSWER = "Я ожидаю другой ответ. Попробуй еще раз: ";
    static final String SUCCESS_MESSAGE = " - это то что надо!";

    void showMessage(String message){
        System.out.println(message);
    }
}
