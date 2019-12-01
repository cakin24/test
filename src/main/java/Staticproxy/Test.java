package Staticproxy;

import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application {

    public static void main( String[] args ) {
        Father father = new Father(new Son());
        father.findLove();
    }

    @Override
    public void start( Stage primaryStage ) {

    }
}
