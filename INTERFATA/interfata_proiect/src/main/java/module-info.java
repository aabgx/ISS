module com.interfata_proiect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.interfata_proiect to javafx.fxml;
    exports com.interfata_proiect;
}