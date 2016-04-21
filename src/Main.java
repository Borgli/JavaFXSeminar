import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Rocket League Rank Extractor");
        primaryStage.getIcons().add(0, new Image("https://suffkoeppe.com/images/rocketleague/rocketleague.png"));
        primaryStage.getIcons().add(1, new Image("http://cdn.akamai.steamstatic.com/steamcommunity/public/images/apps/252950/217214f6bd922a8da8bdd684aa94b1ef8e7724d1.jpg"));
        primaryStage.getIcons().add(2, new Image("http://im5.trueachievements.com/imagestore/0001863700/1863764.png"));

        Button button = new Button("Click here!");
        button.setOnAction(event -> System.out.println("Hei!"));
        button.setFont(new Font(20));
        button.setPadding(new Insets(30));

        Button button2 = new Button("Click here!");
        button2.setOnAction(event -> System.out.println("Hei!"));
        button2.setFont(new Font(20));
        button2.setPadding(new Insets(30));

        /*StackPane root = new StackPane();
        root.getChildren().add(button);
        root.getChildren().add(button2);*/





        GridPane grid = new GridPane();
        //grid.getChildren().addAll(button, button2);
        grid.add(button, 0, 0);
        grid.add(button2, 0, 1);
        //grid.getChildren().add(button2);

        Rectangle2D primaryScreen = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(primaryScreen.getMinX()/2);
        primaryStage.setY(primaryScreen.getMinY() / 2);
        primaryStage.setWidth(primaryScreen.getWidth() / 2);
        primaryStage.setHeight(primaryScreen.getHeight() / 2);
        primaryStage.centerOnScreen();

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
