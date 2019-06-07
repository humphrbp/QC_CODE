
// TODO Auto-generated method stub
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class QR_CODE extends Application

{

	public void start(Stage primaryStage) {

		Pane pane = new Pane();

		Group group = new Group();

		for (int x = 0; x < 25; x++) {
			for (int y = 0; y < 25; y++) {

				Rectangle rectangle = new Rectangle(x * 10, y * 10, 10, 10);

				// Left Upper Maker
				if (x == 0 & y <= 6 || x <= 6 & y == 6 || x == 6 & y <= 6 || y == 0 & x <= 6) {
					rectangle.setFill(Color.BLACK); // Left Upper Black Outer Square
				} else if (x < 5 & x > 1 & y < 5 & y > 1) {
					rectangle.setFill(Color.BLACK); // Left Upper Black Inner Square
				} else if (x == 1 & y < 6 & y > 0 || x > 0 & x < 6 & y == 1 || x == 5 & y < 6 & y > 0
						|| y == 5 & x < 6 & x > 0 || x == 7 & y <= 7 || y == 7 & x <= 7) {
					rectangle.setFill(Color.WHITE); // Left Upper White Inner and Outer
					// Right Upper Maker
				} else if (x == 24 & y <= 6 || y == 6 & x >= 18 || x == 18 & y <= 6 || y == 0 & x > 18) {
					rectangle.setFill(Color.BLACK); // Right Upper Black Outer Square
				} else if (x <= 22 & x >= 20 & y <= 4 & y >= 2) {
					rectangle.setFill(Color.BLACK); // Right Upper Black Inner Square
				} else if (x == 23 & y < 6 & y > 0 || x > 18 & x < 23 & y == 1 || x == 19 & y < 6 & y > 0
						|| y == 5 & x < 23 & x > 0 || x == 17 & y <= 7 || y == 7 & x >= 17) {
					rectangle.setFill(Color.WHITE); // Right Upper White Inner and Outer
					// LEft Lower Maker
				} else if (x == 0 & y >= 18 || y == 18 & x <= 6 || x == 6 & y >= 18 || y == 24 & x <= 6) {
					rectangle.setFill(Color.BLACK); // LEft Lower Black Outer Square
				} else if (x <= 4 & x >= 2 & y <= 22 & y >= 20) {
					rectangle.setFill(Color.BLACK); // LEft Lower Black Inner Square
				} else if (x == 1 & y > 18 & y < 24 || x < 6 & x > 0 & y == 19 || x < 6 & x > 0 & y == 23
						|| x == 5 & y > 18 & y < 24 || x == 7 & y >= 17 || y == 17 & x <= 7) {
					rectangle.setFill(Color.WHITE); // LEft Lower White Inner and Outer

					// Randomly Assign Rest of Squares
				} else if (Math.round(Math.random()) == 1) {
					rectangle.setFill(Color.BLACK);
				} else {
					rectangle.setFill(Color.WHITE);
				}

				group.getChildren().add(rectangle);

			}
		}
		pane.getChildren().add(group);
		primaryStage.setTitle("QR Code");
		primaryStage.setScene(new Scene(pane, 250, 250));
		primaryStage.show();
	}

	public static void main(String[] args)

	{

		launch(args);
	}

}
