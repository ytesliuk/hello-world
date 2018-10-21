package ua.javacourse.labs;

import java.util.Scanner;

/**
 * Created by Yuliia Tesliuk on 10/21/2018
 */
class Controller {
    private Model model;
    private View view;
    private Scanner input;


    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        input = new Scanner(System.in);
    }


    void startInteraction(){
        view.showMessage(View.INTRODUCTION);
        view.showMessage(View.FIRST_REQUEST);
        lookingForCorrectAnswer(Model.FIRST_WORD);
        view.showMessage(View.SECOND_REQUEST);
        lookingForCorrectAnswer(Model.SECOND_WORD);
        view.showMessage(model.getSentence() + View.SUCCESS_MESSAGE);
    }

    // ask for translation until get the correct answer
    private void lookingForCorrectAnswer(String correctWord) {
        while (!model.isMatched(input.next(), correctWord)) {
            view.showMessage(View.WRONG_ANSWER);
        }
    }
}
