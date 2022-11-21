module com.example.lesson10fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson10fx to javafx.fxml;
    exports com.example.lesson10fx;
}