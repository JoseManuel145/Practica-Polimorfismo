module com.manuel.instituto_descartes {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.manuel.instituto_descartes;
    exports com.manuel.instituto_descartes.models;
    exports com.manuel.instituto_descartes.controllers;

    opens com.manuel.instituto_descartes to javafx.fxml;
    opens com.manuel.instituto_descartes.models to javafx.fxml;
    opens com.manuel.instituto_descartes.controllers to javafx.fxml;
}
