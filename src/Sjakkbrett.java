import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Rune on 21.04.2016.
 */
public class Sjakkbrett extends Application {
    private final int brettX = 8, brettY = 8;

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane sjakkGrid = new GridPane();
        sjakkGrid.setStyle("-fx-border-color: black");
        int count = 8;
        char pos = 'A';
        for (int i = 0; i < brettX + 1; i++) {
            sjakkGrid.getRowConstraints().add(new RowConstraints(40));
            sjakkGrid.getColumnConstraints().add(new ColumnConstraints(40));
            for (int j = 0; j < brettY + 1; j++) {
                StackPane sjakkRute = new StackPane();
                if (i == 0 && j != brettY) {
                    Text counter = new Text("" + count--);
                    counter.setStyle("-fx-font-weight: bold");
                    counter.setFont(new Font(16));
                    sjakkRute.getChildren().add(counter);
                } else if (i != 0 && j == brettY) {
                    Text counter = new Text("" + pos++);
                    counter.setStyle("-fx-font-weight: bold");
                    counter.setFont(new Font(16));
                    sjakkRute.getChildren().add(counter);
                } else {
                    int mod = j;
                    if (i % 2 == 0) {
                        mod += 1;
                    }
                    if (mod % 2 == 0) {
                        sjakkRute.setStyle("-fx-background-color: gray");
                    }
                    /*if (j == 1) {
                        ImageView image = new ImageView(new Image("http://www.charbase.com/images/glyph/9823"));
                        //image.setOnDragDetected(event -> );
                        sjakkRute.getChildren().add(image);
                    }*/
                }
                sjakkGrid.add(sjakkRute, i, j);
            }
        }
        Scene scene = new Scene(sjakkGrid);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sjakkbrett");
        primaryStage.getIcons().add(new Image("https://gameknot.com/img/gk32x32.png"));
        primaryStage.show();

    }
}
