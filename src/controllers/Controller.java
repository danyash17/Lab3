package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private MenuBar Menu;

    @FXML
    private Menu MenuFile;

    @FXML
    private MenuItem MenuFileSave;

    @FXML
    private Menu MenuHelp;

    @FXML
    private MenuItem MenuHelpAbout;


    @FXML
    private TextField XFromField;

    @FXML
    private TextField XToField;

    @FXML
    private TextField StepField;

    @FXML
    private Button CalculateButton;

    @FXML
    private Button ClearButton;
@FXML
    private void showDialogWindow_About() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Информация о программе");
        // alert.setHeaderText("Results:");
    alert.setHeaderText("Выполнил студент РФиКТ 2 курса 8 группы ");
        alert.setContentText("Шкабара Даниил Сергеевич");

        alert.showAndWait();
    }
}

