import com.jfoenix.controls.JFXButton;

import javafx.beans.value.ChangeListener;
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
    public static void color(Color color,JFXButton button1,JFXButton button2, JFXButton button3){
        String colorName = "#"+color.toString().substring(2,8);

        button1.setStyle("-fx-background-color: " +colorName+";");
        button1.setText(colorName.toUpperCase());


    }

}
