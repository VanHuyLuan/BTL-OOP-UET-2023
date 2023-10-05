import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    Scene scene2 ;
    Scene scene;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        // Tạo một nút ấn "Hello, World!"
        Button btn = new Button("Hello, World!");
        Button btn2 = new Button("Hello, World2!");

        // Xử lý sự kiện khi nút ấn được bấm
        //btn.setOnAction(e -> System.out.println("Hello, World!"));
        btn.setOnAction(e -> window.setScene(scene2));

        // Tạo một layout và thêm nút vào đó
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Tạo một Scene với layout và đặt kích thước cửa sổ
        scene = new Scene(root, 500, 700);
        //root2
        StackPane root1 = new StackPane();

        // Đặt Scene cho primaryStage

        root1.getChildren().add(btn2);
        scene2 = new Scene(root1, 500, 700);

        primaryStage.setScene(scene);
        // Đặt tiêu đề cửa sổ
        primaryStage.setTitle("Hello, World!");

        // Hiển thị cửa sổ
        primaryStage.show();
    }
}
