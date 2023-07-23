package herencia;

import atributos.SmartDevice;

public class SmartWatch extends SmartDevice {

    // atributos reloj
    public String correa;
    public String sensores;
    public String compatibilidad;


    // constructor vacio
    public SmartWatch(){}

    // constructor con atributos
    public SmartWatch(String marca, String modelo, String serie, String material,
                      String resolucionPantalla, String bluetooth, String reproduccionAudio,
                      String correa, String sensores, String compatibilidad) {

        // atributos heredados de clase herencia.SmartPhone
        super(marca, modelo, serie, material, resolucionPantalla, bluetooth, reproduccionAudio);

        this.correa = correa;
        this.sensores = sensores;
        this.compatibilidad = compatibilidad;
    }
}


