package controllers;
import java.io.*;
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
    public TextArea t20;
    public TextArea t30;
    public TextArea t40;
    public TextArea t50;
    public TextArea t60;
    public TextArea t70;
    public TextArea t80;
    public TextArea t90;
    public TextArea t01;
    public TextArea t11;
    public TextArea t21;
    public TextArea t31;
    public TextArea t41;
    public TextArea t61;
    public TextArea t51;
    public TextArea t71;
    public TextArea t81;
    public TextArea t91;
    public TextArea t02;
    public TextArea t12;
    public TextArea t22;
    public TextArea t32;
    public TextArea t42;
    public TextArea t52;
    public TextArea t62;
    public TextArea t72;
    public TextArea t82;
    public TextArea t92;
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
    @FXML
private void doGorner(){
        String from_s="0";
        String to_s="0";
        String step_s="0";
        String nums="1234567890";
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
        t00.setText(res[0][0]);
        if(isReflected(t[0][1])) t02.setText("TRUE");
        t10.setText(res[1][0]);
        if(isReflected(t[1][1])) t12.setText("TRUE");
        t20.setText(res[2][0]);
        if(isReflected(t[2][1])) t22.setText("TRUE");
        t30.setText(res[3][0]);
        if(isReflected(t[3][1])) t32.setText("TRUE");
        t40.setText(res[4][0]);
        if(isReflected(t[4][1])) t42.setText("TRUE");
        t50.setText(res[5][0]);
        if(isReflected(t[5][1])) t52.setText("TRUE");
        t60.setText(res[6][0]);
        if(isReflected(t[6][1])) t62.setText("TRUE");
        t70.setText(res[7][0]);
        if(isReflected(t[7][1])) t72.setText("TRUE");
        t80.setText(res[8][0]);
        if(isReflected(t[8][1])) t82.setText("TRUE");
        t90.setText(res[9][0]);
        if(isReflected(t[9][1])) t92.setText("TRUE");
        t01.setText(res[0][1]);
        t11.setText(res[1][1]);
        t21.setText(res[2][1]);
        t31.setText(res[3][1]);
        t41.setText(res[4][1]);
        t51.setText(res[5][1]);
        t61.setText(res[6][1]);
        t71.setText(res[7][1]);
        t81.setText(res[8][1]);
        t91.setText(res[9][1]);
    }

}
