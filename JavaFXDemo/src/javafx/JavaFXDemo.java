package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(new UIContent()));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(JavaFXDemo.class, args);
	}
}
