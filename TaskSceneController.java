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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TaskSceneController {
  public static Scene Create() throws Exception {
    URL sceneURL = TaskSceneController.class.getResource("task-scene.fxml");
    Parent root = FXMLLoader.load(sceneURL);
    Scene scene = new Scene(root);
    return scene;
  }

  @FXML
  private Button btRegister;

  @FXML
  private TextField tfNewTask;

  @FXML
  private ListView lvTasks;

  @FXML
  protected void registerTask(ActionEvent e) {
    if (tfNewTask.getText().isEmpty()) {
        Alert alert = new Alert(
            AlertType.ERROR,
            "Insira algo para prosseguir . . .",
            ButtonType.OK
        );
        alert.showAndWait(); 
    } else {
        lvTasks.getItems().add(tfNewTask.getText());
        tfNewTask.clear();
    }
  }
}