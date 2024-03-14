package co.edu.uniquindio.parcial1fx.transporteapp.Model.Builder;

import co.edu.uniquindio.parcial1fx.transporteapp.Model.Propietario;
import co.edu.uniquindio.parcial1fx.transporteapp.Model.Vehiculo;

import java.util.ArrayList;

public class VehiculoBuilder<T extends VehiculoBuilder<T>>{

    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
    protected Propietario propietarioAsociado;
    protected ArrayList<Propietario> listaPropietariosAsociados = new ArrayList<>();

    public T placa(String placa){
        this.placa=placa;
        return self();
    }

    public T modelo(String modelo){
        this.modelo=modelo;
        return self();
    }

    public T marca(String marca){
        this.marca=marca;
        return self();
    }

    public T color(String color){
        this.color=color;
        return self();
    }

    public T asociadoPrincipal(Propietario propietarioAsociado){
        this.propietarioAsociado=propietarioAsociado;
        return self();
    }

    public T listaPropietariosAsociados(ArrayList<Propietario> listaPropietariosAsociados){
        this.listaPropietariosAsociados=listaPropietariosAsociados;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public Vehiculo build(){
        return new Vehiculo(placa,modelo,marca,color,propietarioAsociado,listaPropietariosAsociados);
    }

}

