package co.edu.uniquindio.parcial1fx.transporteapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EmpresaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EmpresaApplication.class.getResource("Empresa.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Empresa De Transporte");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}