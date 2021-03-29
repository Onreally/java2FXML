package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextArea textArea;

    @FXML
    public TextField field;

    @FXML
    public void click(ActionEvent actionEvent) {
        textArea.appendText(field.getText()+"\n");
        field.clear();
        field.requestFocus();
    }
}
