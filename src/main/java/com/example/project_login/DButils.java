package com.example.project_login;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DButils {

    public static void changeScene (ActionEvent event, String fxmlFile, String title, String username, String username1) {

        Parent root = null;

        if (username != null && username1 != null){
            try{
                FXMLLoader loader = new FXMLLoader(DButils.class.getResource(fxmlFile));
                root = loader.load();

                LoggedInController loggedInController = loader.getController();
                loggedInController.setUserInformation(username,username1);

            } catch (IOException e){
                e.printStackTrace();
            }
        } else {
            try{
                root = FXMLLoader.load(DButils.class.getResource(fxmlFile));

            } catch (IOException e){
                e.printStackTrace();
            }
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }

    //public static  void signUpUser(ActionEvent event, String username, String password, String username1){
        //Connection connection = null;
        //PreparedStatement psInsert = null;
        //PreparedStatement psCheckUserExists = null;
        //ResultSet resultSet = null;


        //try{
        //    connection = DriverManager.getConnection(url: need to put localhost, "root", toor );
        //    psCheckUserExists = connection. prepareStatement("Select * From users WHERE username = ?");
         //   resultSet = psCheckUserExists.executeQuery();

        //    if(resultSet.isBeforeFirst()){
         //       System.out.println("User already Exist!");

          //  }

       // }

}
