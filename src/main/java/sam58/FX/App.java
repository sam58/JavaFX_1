package sam58.FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Hello world!
 */
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("test");
        Text text = new Text(10, 20, "test OK!");
        text.setFont(new Font(40));
        BorderPane pane = new BorderPane();
        BorderPane innerPane = new BorderPane();
        Text innerText = new Text("sssssss");
        innerPane.setBottom(innerText);
        pane.setRight(innerPane);
        pane.setCenter(button);
        pane.setTop(text);
        Scene scene = new Scene(pane, 400, 400);

        primaryStage.setTitle("My First Test");
        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
