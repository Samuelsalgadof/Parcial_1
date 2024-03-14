module co.edu.uniquindio.parcial1fx.transporteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.transporteapp to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.transporteapp;

    exports co.edu.uniquindio.parcial1fx.transporteapp.Controller;
    opens co.edu.uniquindio.parcial1fx.transporteapp.Controller;
}