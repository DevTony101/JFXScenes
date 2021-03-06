package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import pojos.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    private Usuario usuario;

    @FXML
    private TextField tfNombre, tfApellido, tfCiudad;

    @FXML
    private void enviarDatos(MouseEvent event) {
        String nombre = tfNombre.getText().trim();
        String apellido = tfApellido.getText().trim();
        String ciudad = tfCiudad.getText().trim();
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setCiudad(ciudad);
    }

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
