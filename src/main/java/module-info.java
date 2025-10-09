module com.example.projectgame1_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.example.projectgame1_1 to javafx.fxml;
    exports com.example.projectgame1_1;
}