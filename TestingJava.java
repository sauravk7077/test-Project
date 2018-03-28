import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

class TestingJava extends Application
{
  public static void main(String args[]) {launch(args);}
  
  public void start(Stage stage) throws Exception
  {
    //Set Title
    stage.setTitle("It's the title");
    
    //Buttons
    Button b = new Button("Click");
    b.setOnAction(e -> {
      Alert a = new Alert(Alert.AlertType.INFORMATION);
      a.setTitle("Some information for you");
      a.setHeaderText("Look, some information down there!");
      a.alert.setContentText("Oh, you have clicked the button");
      a.showAndWait();
    });
    
    //StackPane
    StackPane sp = new StackPane();
    
    //Create Scene
    Scene scene = new Scene();
    
  }
}
