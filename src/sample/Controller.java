package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.LinkedList;

public class Controller {
    @FXML
    TextField name;
    @FXML
    TextField age;
    @FXML
    TextArea textarea;
    private ListStudent newListStudent;
    public Controller() {
        newListStudent = new ListStudent();
    }

    public void addElement(){
        String getName = name.getText();
        int getAge = Integer.parseInt(age.getText());
        newListStudent.addElementToMap(getName,getAge);
        name.setText("");
        age.setText("");
    }
    public void showList(){
        textarea.setText(newListStudent.toString());
    }

}
