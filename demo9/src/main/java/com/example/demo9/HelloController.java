package com.example.demo9;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField wysokosc_ID;
    public TextField promien_ID;
    public TextField grubosc_ID;
    public TextArea results_ID;
    public Label  asd;

    public double truncate(double n){ //funkcja zwraca liczbe skrocona do 2 wartosci po przecinku
        n = n*Math.pow(10,2);
        n = Math.floor(n);
        n = n / Math.pow(10,2);
        return n;
    }

    @FXML
    protected void oblicz () {
        results_ID.setText(""); //wyczycic TextArea przed wyswietleniem

        double d_promien = Double.parseDouble(promien_ID.getText());
        double d_wysokosc = Double.parseDouble(wysokosc_ID.getText());
        double d_grubosc = Double.parseDouble(grubosc_ID.getText());

        double pole_b = 2*3.14*d_promien*d_wysokosc;
        double pole_p = 2*3.14*d_promien*d_promien;
        double pole_c = pole_b + pole_p; // mm^2


    }

}