package ua.javacourse.labs;

/**
 * Created by Yuliia Tesliuk on 10/21/2018
 */
public class Main {
    public static void main(String[] args){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.startInteraction();
    }
}
