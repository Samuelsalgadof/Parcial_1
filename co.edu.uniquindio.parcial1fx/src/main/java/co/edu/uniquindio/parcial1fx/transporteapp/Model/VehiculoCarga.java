package co.edu.uniquindio.parcial1fx.transporteapp.Model;

import java.util.ArrayList;

public class VehiculoCarga extends Vehiculo{
    private double capacidadCarga;
    private int numEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, ArrayList<Propietario> listaPropietariosAsociados, double capacidadCarga, int numEjes) {
        super(placa, modelo, marca, color, propietarioAsociado, listaPropietariosAsociados);
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "VehiculoCarga: " +
                "capacidadCarga = " + capacidadCarga +
                ", numEjes = " + numEjes;
    }
}

