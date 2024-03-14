package co.edu.uniquindio.parcial1fx.transporteapp.Model.Builder;


import co.edu.uniquindio.parcial1fx.transporteapp.Model.VehiculoCarga;

public class VehiculoCargaBuilder extends VehiculoBuilder<VehiculoCargaBuilder> {
        protected double capacidadCarga;
        protected int numEjes;

        public VehiculoCargaBuilder capacidadCarga(double capacidadCarga){
            this.capacidadCarga=capacidadCarga;
            return this;
        }
        public VehiculoCargaBuilder numEjes(int numEjes){
            this.numEjes=numEjes;
            return this;
        }
        @Override
        public VehiculoCarga build(){
            return new VehiculoCarga(placa,modelo,marca,color,propietarioAsociado,listaPropietariosAsociados,capacidadCarga,numEjes);
        }
        @Override
        protected VehiculoCargaBuilder self(){
            return this;
        }
    }

