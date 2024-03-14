package co.edu.uniquindio.parcial1fx.transporteapp.Model;

import co.edu.uniquindio.parcial1fx.transporteapp.Model.Builder.VehiculoBuilder;

import java.util.ArrayList;




public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private Propietario propietarioAsociado;
    private ArrayList<Propietario> listaPropietariosAsociados = new ArrayList<>();

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, ArrayList<Propietario> listaPropietariosAsociados) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.propietarioAsociado = propietarioAsociado;
        this.listaPropietariosAsociados = listaPropietariosAsociados;
    }

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Propietario getPropietarioAsociado() {
        return propietarioAsociado;
    }

    public ArrayList<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                "placa = " + placa +
                ", modelo = " + modelo +
                ", marca = " + marca +
                ", color = " + color +
                ", propietarioAsociado = " + propietarioAsociado +
                ", listaPropietariosAsociados = " + listaPropietariosAsociados;
    }
}
