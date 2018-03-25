package ui;

import rcalc.Calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Calculator calculator = new Calculator();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorUI.fxml"));
        Parent root = loader.load();
        CalculatorUIController controller = loader.getController();
        controller.setCalculator(calculator);

        Scene scene = new Scene(root);
        primaryStage.setResizable(false);
        primaryStage.setTitle("RCalc");

        scene.addEventHandler(KeyEvent.KEY_PRESSED, controller.getEventHandler());
        controller.txt_input.addEventHandler(KeyEvent.KEY_PRESSED, controller.getEventHandler());
        controller.tgl_auto.fire();

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
