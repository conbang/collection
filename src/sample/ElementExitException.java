package sample;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ElementExitException extends Exception{
    ElementExitException(String name){
        super();
        Text exception = new Text(name);
    }
    public void showException(String txt){
        Stage popUp = new Stage();
        GridPane layout = new GridPane();
        Text msg = new Text(txt+" is exits");
        layout.getChildren().add(msg);
        popUp.setScene(new Scene(layout,200,200));
        popUp.showAndWait();
    }
}
