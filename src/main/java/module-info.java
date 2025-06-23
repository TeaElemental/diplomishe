module ru.timka.diplomishe {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.timka.diplomishe.controller to javafx.fxml;  // Это критически важная строка
    exports ru.timka.diplomishe;
    exports ru.timka.diplomishe.controller;  // Если нужно использовать контроллер из других модулей
}