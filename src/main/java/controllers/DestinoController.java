package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import lombok.Setter;
import pojos.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class DestinoController implements Initializable {

    @Setter
    private Usuario usuario;

    @FXML
    private Label lblNombre, lblCiudad, lblApellido;

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    private void recuperarDatos() {
        lblNombre.setText(String.format("Nombre: %s", this.usuario.getNombre()));
        lblApellido.setText(String.format("Apellido: %s", this.usuario.getApellido()));
        lblCiudad.setText(String.format("Ciudad: %s", this.usuario.getCiudad()));
    }
}
