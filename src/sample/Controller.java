package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class Controller {
    @FXML
    private MenuItem mnExit;

    @FXML
    private void click_exit(ActionEvent event){
        Platform.exit();
    }
}
