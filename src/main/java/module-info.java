module CaseConverter.main {
    requires transitive javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens jasmine.jragon to javafx.fxml;
    exports jasmine.jragon;
}