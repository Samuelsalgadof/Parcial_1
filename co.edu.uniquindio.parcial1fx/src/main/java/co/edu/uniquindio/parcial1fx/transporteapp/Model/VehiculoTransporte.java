package co.edu.uniquindio.parcial1fx.transporteapp.Model;

import java.util.ArrayList;

public class VehiculoTransporte extends Vehiculo{
    private int maxNumPasajeros;
    private ArrayList<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, ArrayList<Propietario> listaPropietariosAsociados, int maxNumPasajeros, ArrayList<Usuario> listaUsuariosAsociados) {
        super(placa, modelo, marca, color, propietarioAsociado, listaPropietariosAsociados);
        this.maxNumPasajeros = maxNumPasajeros;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public int getMaxNumPasajeros() {
        return maxNumPasajeros;
    }

    public ArrayList<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "VehiculoTransporte: " +
                "maxNumPasajeros = " + maxNumPasajeros +
                ", listaUsuariosAsociados = " + listaUsuariosAsociados;
    }
}

