package ru.timka.diplomishe;

import ru.timka.diplomishe.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PriceAggregatorApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Загрузка FXML файла
            FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = loader.load();

            // Получение контроллера
            MainController controller = loader.getController();
            controller.initialize();

            // Настройка сцены
            Scene scene = new Scene(root, 800, 600);
            scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

            // Настройка главного окна
            primaryStage.setTitle("Агрегатор цен интернет-магазинов");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}