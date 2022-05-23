package com.example.javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<Trainer> table_info;

    @FXML
    private TableColumn<?, ?> col_consult;

    @FXML
    private TableColumn<Trainer, Button> col_action;

    @FXML
    private TableColumn<Trainer, Integer> col_client;

    @FXML
    private TableColumn<Trainer, Integer> col_exp;

    @FXML
    private TableColumn<Trainer, Integer> col_fees;

    @FXML
    private TableColumn<Trainer, String> col_name;

    @FXML
    private TableColumn<Trainer, Integer> col_rating;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    iniTable();
    loadData();
    }

    private void iniTable(){
    inicols();
    }
    private void inicols(){
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_fees.setCellValueFactory(new PropertyValueFactory<>("fees"));
        col_exp.setCellValueFactory(new PropertyValueFactory<>("exp"));
        col_client.setCellValueFactory(new PropertyValueFactory<>("clients"));
        col_action.setCellValueFactory(new PropertyValueFactory<>("Hire"));
        col_consult.setCellValueFactory(new PropertyValueFactory<>("Consult"));
        col_rating.setCellValueFactory(new PropertyValueFactory<>("rating"));

    editcols();
    }
    private void editcols(){
        col_name.setCellFactory(TextFieldTableCell.forTableColumn());


    }

    private void loadData(){
        ObservableList<Trainer> data_table = FXCollections.observableArrayList();


            data_table.add(new Trainer("Abdullah","10 Years","2 Thousand","5","5/5",new Button("Hire"),new Button ("Consult")));
        data_table.add(new Trainer("Shazaib","5 Years","4 Thousand","10","4/5",new Button("Hire"),new Button ("Consult")));
        data_table.add(new Trainer("Hammad","5 Months","1 Thousand","13","3.5/5",new Button("Hire"),new Button ("Consult")));
        data_table.add(new Trainer("Zain","2 Years","3500 Hundred","20","2/5",new Button("Hire"),new Button ("Consult")));
        data_table.add(new Trainer("Aftab","New","2500 Hundred","38","2.5/5",new Button("Hire"),new Button ("Consult")));
        data_table.add(new Trainer("Baloch","3 Months","1600 Hundred","25","3/5",new Button("Hire"),new Button ("Consult")));
        data_table.add(new Trainer("Kashif","1 Year","2000 Rupees","8","1/5",new Button("Hire"),new Button ("Consult")));


        table_info.setItems(data_table);
    }




}