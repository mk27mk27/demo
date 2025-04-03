import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {  // ✅ Must extend Application

    public Main() {  // ✅ Public constructor (or remove it)
        super();  // Not mandatory, but ensures superclass is initialized
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX without FXML!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // ✅ Must call launch() in main method
    }
}
