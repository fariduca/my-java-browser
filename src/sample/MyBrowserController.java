package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MyBrowserController {

    @FXML
    private WebView webView;

    @FXML
    private TextField urlTextField;

    private WebEngine webEngine;

    @FXML
    void goPressed(ActionEvent event) {
        webEngine.load(urlTextField.getText());
    }

    public void initialize() {
        webEngine = webView.getEngine();
        urlTextField.setText("https://ucentralasia.org");
        webEngine.load("https://ucentralasia.org");
    }

}
