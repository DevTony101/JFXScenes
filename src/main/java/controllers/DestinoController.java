package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import pojos.Usuario;
import utils.UsuarioHolder;

import java.net.URL;
import java.util.ResourceBundle;

public class DestinoController implements Initializable {

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
        UsuarioHolder holder = UsuarioHolder.getInstance();
        Usuario u = holder.getUsuario();
        lblNombre.setText(String.format("Nombre: %s", u.getNombre()));
        lblApellido.setText(String.format("Apellido: %s", u.getApellido()));
        lblCiudad.setText(String.format("Ciudad: %s", u.getCiudad()));
    }
}
