import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginSceneController {
  public static Scene Create() throws Exception {
    URL sceneURL = LoginSceneController.class.getResource("login-scene.fxml");
    Parent root = FXMLLoader.load(sceneURL);
    Scene scene = new Scene(root);
    return scene;
  }

  @FXML
  private Button btLogin;

  @FXML
  private PasswordField pfPass;

  @FXML
  private CheckBox cbPass;

  @FXML
  private TextField tfLogin;

  @FXML
  protected void TryLogin(ActionEvent e) throws Exception {
    if (!tfLogin.getText().equals("mavi")) {
      Alert alert = new Alert(
        AlertType.ERROR,
        "Você não é a Mavi",
        ButtonType.OK
      );
      alert.showAndWait();
      return;
    }
    if (!pfPass.getText().equals("namoradadojoao")) {
      Alert alert = new Alert(
        AlertType.ERROR,
        "Você não é a Mavi",
        ButtonType.OK
      );
      alert.showAndWait();
      return;
    }

    Stage crrStage = (Stage)btLogin.getScene().getWindow();
    crrStage.close();

    try {
      Stage stage = new Stage();
      Scene scene = TaskSceneController.Create();
      stage.setScene(scene);
      stage.show();
    } catch (Exception ex) {
      Alert alert = new Alert(
        AlertType.ERROR,
        "Erro ao processar a tela. Consulte o apoio da TI",
        ButtonType.OK
      );
      alert.showAndWait();
      ex.printStackTrace();
      return;
    }
  }
}
