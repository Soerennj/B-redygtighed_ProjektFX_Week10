module com.example.bredygtighed_projektfx_week10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bredygtighed_projektfx_week10 to javafx.fxml;
    exports com.example.bredygtighed_projektfx_week10;
}