module org.example.javfxdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires freetts;


    opens org.example.javfxdemo to javafx.fxml;
    exports org.example.javfxdemo;
}