package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.IngresarNuevoVehiculo;
//import views.ListarVehiculosView;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        IngresarNuevoVehiculo view = new IngresarNuevoVehiculo();
        view.setVisible(true);
    }
}
