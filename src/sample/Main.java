package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {

    static final Pane root = new Pane();

    AtomicInteger currentLevel = new AtomicInteger(1);

    /**
     * Create images.
     *
     * @param imageNumber the image number
     * @param i Y pos * 100
     * @param j X pos * 100
     */
    public void createImages (int imageNumber, int i, int j) {
        final URL imageURL = getClass().getResource("view/" + imageNumber + ".png");
        final Image image = new Image(imageURL.toExternalForm());
        final ImageView imageView = new ImageView(image);
        root.getChildren().addAll(imageView);
        imageView.setY(100*i);
        imageView.setX(100*j);
    }

    public void images() {
        for (int i = 0; i < Levels.levels(currentLevel.get()).length; i++) {
            for (int j = 0; j < Levels.levels(currentLevel.get())[1].length; j++) {
                createImages(Levels.levels(currentLevel.get())[i][j], i, j);
            }
        }
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("LabiFleche");
        primaryStage.resizableProperty().setValue(false);
        primaryStage.setOnCloseRequest(t -> {
            Platform.exit();
            System.exit(0);
        });

        images();

        final URL imageURL = getClass().getResource("view/47.png");
        final Image image = new Image(imageURL.toExternalForm());
        final ImageView Player = new ImageView(image);
        final URL imageURL2 = getClass().getResource("view/46.png");
        final Image image2 = new Image(imageURL2.toExternalForm());
        final ImageView imageView2 = new ImageView(image2);
        root.getChildren().addAll(Player, imageView2);
        Player.setY(0);
        Player.setX(900);
        Player.toFront();
        imageView2.setY(900);
        imageView2.setX(0);

        Scene scene = new Scene(root, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();

        scene.setOnKeyReleased(event -> {
            switch (event.getCode()) {
                case NUMPAD8 -> { switch (Levels.levels(currentLevel.get())[(int) Player.getY()/100][(int) Player.getX()/100]) {
                    case 3, 10, 11, 18, 19, 22, 23, 24, 28, 32, 36, 38, 39, 40, 42 ->
                            Player.setY(Player.getY()-100); }
                }
                case NUMPAD7 -> { switch (Levels.levels(currentLevel.get())[(int) Player.getY()/100][(int) Player.getX()/100]) {
                    case 6, 13, 14, 18, 20, 25, 31, 36, 43 -> {
                        Player.setY(Player.getY()-100);
                        Player.setX(Player.getX()-100); } }
                }
                case NUMPAD9 -> { switch (Levels.levels(currentLevel.get())[(int) Player.getY()/100][(int) Player.getX()/100]) {
                    case 7, 14, 15, 19, 21, 26, 32, 33, 44 -> {
                        Player.setY(Player.getY()-100);
                        Player.setX(Player.getX()+100); } }
                }
                case NUMPAD2 -> { switch (Levels.levels(currentLevel.get())[(int) Player.getY()/100][(int) Player.getX()/100]) {
                    case 1, 8, 9, 16, 17, 20, 21, 24, 28, 30, 34, 37, 38, 40, 44 ->
                        Player.setY(Player.getY()+100); }
                }
                case NUMPAD1 -> { switch (Levels.levels(currentLevel.get())[(int) Player.getY()/100][(int) Player.getX()/100]) {
                    case 5, 12, 13, 17, 23, 26, 30, 35, 42 -> {
                        Player.setY(Player.getY()+100);
                        Player.setX(Player.getX()-100); } }
                }
                case NUMPAD3 -> { switch (Levels.levels(currentLevel.get())[(int) Player.getY()/100][(int) Player.getX()/100]) {
                    case 4, 12, 15, 16, 22, 25, 29, 34, 41 -> {
                        Player.setY(Player.getY()+100);
                        Player.setX(Player.getX()+100); } }
                }
                case NUMPAD4 -> { switch (Levels.levels(currentLevel.get())[(int) Player.getY()/100][(int) Player.getX()/100]) {
                    case 2, 9, 10, 17, 18, 21, 22, 24, 27, 31, 35, 37, 38, 39, 41 ->
                            Player.setX(Player.getX()-100); }
                }
                case NUMPAD6 -> { switch (Levels.levels(currentLevel.get())[(int) Player.getY()/100][(int) Player.getX()/100]) {
                    case 0, 8, 11, 16, 19, 20, 23, 24, 27, 29, 33, 37, 39, 40, 43 ->
                            Player.setX(Player.getX()+100); }
                }
            }
            //FIN
            if (!(Player.getY() == 1000 && Player.getX() == 0)) {
                //Case grise
                if (Levels.levels(currentLevel.get())[(int) (Player.getY()/100)][(int) Player.getX()/100] == 45) {
                    Player.setY(0);
                    Player.setX(900);
                }
            } else {
                System.out.print("FINIT !");
                currentLevel.getAndIncrement();
                root.getChildren().clear();
                root.getChildren().addAll(Player, imageView2);
                images();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
