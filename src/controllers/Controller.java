package controllers;
import java.io.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import javafx.stage.FileChooser;
public class Controller {
    public TextArea t00;
    public TextArea t10;
    public TextArea t01;
    public TextArea t11;
    public Pane p9;
    public TextArea t02;
    public TextArea t03;
    public TextArea t04;
    public TextArea t05;
    public TextArea t06;
    public TextArea t07;
    public TextArea t08;
    public TextArea t09;
    public TextArea t12;
    public TextArea t13;
    public TextArea t14;
    public TextArea t15;
    public TextArea t16;
    public TextArea t17;
    public TextArea t18;
    public TextArea t19;
    public MenuItem MenuHelpLegend;

    @FXML
    private Pane p0;

    @FXML
    private Label l0;

    @FXML
    private Pane p1;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Pane p2;

    @FXML
    private Label l3;

    @FXML
    private Pane p3;

    @FXML
    private Label l4;

    @FXML
    private Pane p4;

    @FXML
    private Label l5;

    @FXML
    private Pane p5;

    @FXML
    private Label l6;

    @FXML
    private Pane p6;

    @FXML
    private Label l7;

    @FXML
    private Pane p7;

    @FXML
    private Label l8;

    @FXML
    private Pane p8;

    @FXML
    private Label l9;
    private double from,to,step;
private double[] a={5,5,1,0,-11};
    @FXML
    private MenuBar Menu;

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
        alert.setHeaderText("Выполнил студент РФиКТ 2 курса 8 группы ");
        alert.setContentText("Шкабара Даниил Сергеевич");

        alert.showAndWait();
    }
    @FXML
    private void showDialogWindow_Legend() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Легенда");
        alert.setHeaderText("КРАСНАЯ ЯЧЕЙКА - СУММА ЦИФР РАВНА 10 ");
        alert.setContentText("ЗЕЛЁНЫЙ ТЕКСТ - ПЕРВЫЙ И ПОСЛЕДНИЙ\n СИМВОЛ СОВПАДАЮТ");

        alert.showAndWait();
    }
    private void showAlert() {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Произошла ошибка");
        alert.setHeaderText("Вы ввели неверные данные ");
        alert.setContentText("Пожалуйста,проверьте правильность написания");
        alert.showAndWait();
    }
    private boolean isReflected(double num){
        String temp=Double.toString(num);
        char last=temp.charAt(temp.length()-1);
        String key=Character.toString(last);
        return temp.startsWith(key);
    }
    private boolean isSumTen(String num){
        int sum=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='.') continue;
            char temp=num.charAt(i);
            int intedchar = Character.getNumericValue(temp);
            sum+=intedchar;
        }
        return sum==10;
    }
    @FXML
private void doGorner(){
        String from_s="0";
        String to_s="0";
        String step_s="0";
        try{
            from_s=XFromField.getText();
            to_s=XToField.getText();
            step_s=StepField.getText();
            if(from_s.isEmpty()||to_s.isEmpty()||step_s.isEmpty())
                throw new IOException("wrong num format");
        }
        catch (IOException e){
        showAlert();
        };
        from=Double.parseDouble(from_s);
        to=Double.parseDouble(to_s);
        step=Double.parseDouble(step_s);
        double[][] t=new double[10][3];
        String[][] res=new String[10][3];
        for(int i=0;from<=to&&i<10;i++,from+=step){
            double sum=0;
            t[i][0]=from;
            t[i][0] = Math.round(t[i][0]* 100.0)/100.0;
            for(int j=0;j<a.length;j++){
                sum=sum*from+a[j];
            }
            sum = Math.round(sum* 100.0)/100.0;
            t[i][1]=sum;
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                res[j][i]=Double.toString(t[j][i]);
            }
        }
        System.out.println(isSumTen(res[0][1]));
        System.out.println(isSumTen(res[1][1]));
        System.out.println(isSumTen(res[2][1]));
        System.out.println(isSumTen(res[3][1]));
        System.out.println(isSumTen(res[4][1]));
        System.out.println(isSumTen(res[5][1]));
        System.out.println(isSumTen(res[6][1]));
        System.out.println(isSumTen(res[7][1]));
        System.out.println(isSumTen(res[8][1]));
        System.out.println(isSumTen(res[9][1]));

        t00.setText(res[0][0]);
        if(isReflected(t[0][1])) {
            l0.setText("TRUE");
            l0.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[0][1])) {
            p0.setStyle("-fx-background-color: red;");

        }
        t01.setText(res[1][0]);
        if(isReflected(t[1][1])) {
            l1.setText("TRUE");
            l1.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[1][1]))  {
            p1.setStyle("-fx-background-color: red;");

        }
        t02.setText(res[2][0]);
        if(isReflected(t[2][1])) {
            l2.setText("TRUE");
            l2.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[2][1])) {
            p2.setStyle("-fx-background-color: red;");

        }
        t03.setText(res[3][0]);
        if(isReflected(t[3][1])){
            l3.setText("TRUE");
            l3.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[3][1])) {
            p3.setStyle("-fx-background-color: red;");

        }
        t04.setText(res[4][0]);
        if(isReflected(t[4][1])){
            l4.setText("TRUE");
            l4.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[4][1])){
            p4.setStyle("-fx-background-color: red;");

        }
        t05.setText(res[5][0]);
        if(isReflected(t[5][1])){
            l5.setText("TRUE");
            l5.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[5][1])){
            p5.setStyle("-fx-background-color: red;");

        }
        t06.setText(res[6][0]);
        if(isReflected(t[6][1])){
            l6.setText("TRUE");
            l6.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[6][1])) {
            p6.setStyle("-fx-background-color: red;");

        }
        t07.setText(res[7][0]);
        if(isReflected(t[7][1])){
            l7.setText("TRUE");
            l7.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[7][1])){
            p7.setStyle("-fx-background-color: red;");

        }
        t08.setText(res[8][0]);
        if(isReflected(t[8][1])){
            l8.setText("TRUE");
            l8.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[8][1])){
            p8.setStyle("-fx-background-color: red;");

        }
        t09.setText(res[9][0]);
        if(isReflected(t[9][1])){
            l9.setText("TRUE");
            l9.setStyle("-fx-text-fill: green");
        }
        if(isSumTen(res[9][1])){
            p9.setStyle("-fx-background-color: red;");

        }
        t10.setText(res[0][1]);
        t11.setText(res[1][1]);
        t12.setText(res[2][1]);
        t13.setText(res[3][1]);
        t14.setText(res[4][1]);
        t15.setText(res[5][1]);
        t16.setText(res[6][1]);
        t17.setText(res[7][1]);
        t18.setText(res[8][1]);
        t19.setText(res[9][1]);
    }

}
