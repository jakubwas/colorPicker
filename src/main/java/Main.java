import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("sample.fxml"));
        Parent pane = loader.load();
        Scene scene = new Scene(pane);

        Controller controller = (Controller)loader.getController();
        controller.setPrimaryStage(primaryStage);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Color Picker");
        primaryStage.setResizable(false);
        primaryStage.setAlwaysOnTop(false);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
