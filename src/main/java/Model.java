import com.jfoenix.controls.JFXButton;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Color;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Model {




    public static void copyText(JFXButton button){
        StringSelection stringSelection = new StringSelection(button.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public static void color(Color color, final JFXButton button1, final JFXButton button2, final JFXButton button3){
        String colorName = "#"+color.toString().substring(2,8);
        button1.setStyle("-fx-background-color: " +colorName+";");
        button1.setText(colorName.toUpperCase());


        button1.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                    if (!newValue.equals(oldValue)){
                       button1.setStyle("-fx-background-color: "+ newValue+";");
                       button1.setText(newValue.toUpperCase());
                       button2.setStyle("-fx-background-color: "+ oldValue+";");
                       button2.setText(oldValue.toUpperCase());
                    }
                    button2.textProperty().addListener(new ChangeListener<String>() {
                        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                            if (!newValue.equals(oldValue)) {
                                button3.setStyle("-fx-background-color: "+ oldValue+";");
                                button3.setText(oldValue.toUpperCase());
                            }
                        }});
            }
        });


    }

}
