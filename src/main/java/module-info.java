module org.example.javfxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javfxdemo to javafx.fxml;
    exports org.example.javfxdemo;
}