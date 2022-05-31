package com.example.javafx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchTologin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAdminl(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("loginAdmin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToTrainerl(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Trainerlogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUserl(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Userlogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
// Admin
    public void switchToAdmin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToAsign(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("signupA.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMarkAttendance(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MarkAttendance.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCheckFees(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CheckFees.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToHireTrainer(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HireTrainer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

//Trainer

    public void switchToTrainer(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TrainerPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToTsign(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("signupT.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCreatework(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CreatWorkout.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCalBurn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CalByt.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCalBMI(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("checkBMIT.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //User
    public void switchToUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToUsign(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("signupU.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCDiet(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CDietPlan.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToEDiet(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EDietPlan.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchTocalBMI(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("calBMI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}