package com.mycompany.lab4b;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class FXMLController implements Initializable {

    @FXML
    public TextField poleTekstowe;
    public ListView lista;

    public Object t=null;
    public String nazwaKlasy = "";

    @FXML
    private void handleButtonAction(ActionEvent event) throws InstantiationException, ClassNotFoundException, IllegalAccessException {
        try {
            lista.setItems(null);
            nazwaKlasy = poleTekstowe.getText();
            Class c = Class.forName("com.mycompany.lab4b." + nazwaKlasy);
            t = c.newInstance();
            ObservableList<String> listaInfo = FXCollections.observableArrayList();
            listaInfo.add("Metody:");
            for (Method i : c.getDeclaredMethods()) {
                listaInfo.add(i.toString()+" ( nazwa: "+i.getName()+" )");
            }
            listaInfo.add("Pola:");
            for (Field i : c.getDeclaredFields()) {
                listaInfo.add(i.toString()+" ( nazwa: "+i.getName()+" )");
            }
            lista.setItems(listaInfo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd");
            System.out.println(e.toString());
        }
    }

    @FXML
    private void usun(ActionEvent event) {
        try {
            lista.setItems(null);
            t = null;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
