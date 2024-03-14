package co.edu.uniquindio.parcial1fx.transporteapp.Factory;

import co.edu.uniquindio.parcial1fx.transporteapp.Model.*;
import co.edu.uniquindio.parcial1fx.transporteapp.Model.Builder.VehiculoCargaBuilder;
import co.edu.uniquindio.parcial1fx.transporteapp.Model.Builder.VehiculoTransporteBuilder;

import java.util.ArrayList;

public class ModelFactory {

    private static ModelFactory modelFactory;

    private EmpresaTransporte empresaTransporte;

    private ModelFactory(){
        empresaTransporte = new EmpresaTransporte();
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {

        Propietario propietario = new Propietario();

        propietario.setNombrePropietario("Vector");
        propietario.setCedula("456454");
        propietario.setCelular("12346");
        propietario.setEmail("vectortugaticanocturna@gmail.com");

        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("pedro");
        usuario.setEdad(17);

        Usuario usuario1 = new Usuario();
        usuario1.setNombreUsuario("Samuel");
        usuario1.setEdad(25);

        Usuario usuario2 = new Usuario();
        usuario2.setNombreUsuario("Jean Pier");
        usuario2.setEdad(20);

        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(usuario);
        listaUsuario.add(usuario1);

        empresaTransporte.getListaUsuarios().add(usuario);
        empresaTransporte.getListaUsuarios().add(usuario1);
        empresaTransporte.getListaUsuarios().add(usuario2);

        VehiculoTransporte vehiculoTransporte = new VehiculoTransporteBuilder()
                .placa("YMA 874")
                .modelo("2023")
                .marca("Tesla")
                .color("Azul")
                .numPasajerosMax(35)
                .listaUsuariosAsociados(listaUsuario)
                .build();
        propietario.getVehiculoList().add(vehiculoTransporte);
        empresaTransporte.getVehiculoTransporteList().add(vehiculoTransporte);

        VehiculoCarga vehiculoCarga1 = new VehiculoCargaBuilder()
                .placa("NS 200")
                .modelo("2035")
                .marca("Yamaha")
                .color("Negro")
                .capacidadCarga(521)
                .build();
        empresaTransporte.getVehiculoCargaList().add(vehiculoCarga1);
    }

    public boolean crearVehiclo(String placa, String modelo, String marca, String color){
        return empresaTransporte.crearVehiclo(placa,modelo,marca,color);
    }

    public int calcularNumPasajeros(String placa){
        return empresaTransporte.calcularNumPasajeros(placa);
    }

    public int calcularMayoresEdad(){
        return empresaTransporte.calcularMayoresEdad();
    }

    public double calcularCarga(){return empresaTransporte.calcularCarga();}
}
