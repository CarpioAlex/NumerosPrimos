package formulario;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label; // Asegúrate de que el fx:id coincida con el FXML

    @FXML
    private Button button; // Asegúrate de que el fx:id coincida con el FXML

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicializa elementos aquí si es necesario
    }    

    @FXML
    private void handleButtonClick() {
        label.setText("¡Botón clicado!");
    }
}
