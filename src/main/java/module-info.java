module com.docente.usuariosjson {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens com.docente.usuariosjson to javafx.fxml;
    exports com.docente.usuariosjson;

    opens com.docente.usuariosjson.controller to javafx.fxml;

    exports com.docente.usuariosjson.dto;

    // ✅ SOLUCIÓN: Una sola línea combinando los permisos separados por coma
    opens com.docente.usuariosjson.dto to javafx.fxml, com.google.gson, javafx.base;
}