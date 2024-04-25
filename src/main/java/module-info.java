module juanramongonzalez.juridico36 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    opens juanramongonzalez.juridico36 to javafx.fxml;
    exports juanramongonzalez.juridico36;
}
