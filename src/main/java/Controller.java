import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXColorPicker;
import com.sun.org.apache.xpath.internal.operations.Mod;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Controller controller;



    private Model model = new Model();
    public void initialize(URL location, ResourceBundle resources) {
    }

    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @FXML private JFXButton idButton1;
    @FXML private JFXButton idButton2;
    @FXML private JFXButton idButton3;
    @FXML private JFXColorPicker idColorPicker;

    @FXML
    void actionAlwaysOnTop(ActionEvent event) {
            if (primaryStage.isAlwaysOnTop()){
                primaryStage.setAlwaysOnTop(false);
            }else { primaryStage.setAlwaysOnTop(true); }
    }

    @FXML
    void actionButton1(ActionEvent event) {
        Model.copyText(idButton1);
    }
    public void actionButton2(ActionEvent actionEvent) {
        Model.copyText(idButton2);
    }
    public void actionButton3(ActionEvent actionEvent) {
        Model.copyText(idButton3);
    }

    @FXML
    void actionColorPicker(ActionEvent event) {
        Model.color(idColorPicker.getValue(),idButton1,idButton2,idButton3);
    }




}
