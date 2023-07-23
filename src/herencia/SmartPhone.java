package herencia;

import atributos.SmartDevice;

public class SmartPhone extends SmartDevice {

    // atributos celular
    public String sistemaOperativo;
    public String tamanoPantalla;
    public String procesador;
    public String RAM;
    public String camara;
    public String memoria;
    public String wiFi;
    public String sincronizacionPC;

    // constructor vacio
     public SmartPhone(){}

    // constructor con atributos clase celular
    public SmartPhone(String marca, String modelo, String serie, String material,
                      String resolucionPantalla, String bluetooth, String reproduccionAudio,
                      String sistemaOperativo, String tamanoPantalla,
                      String procesador, String RAM, String camara, String memoria, String wiFi,
                      String sincronizacionPC) {

        // atributos heredados de clase herencia.SmartPhone
        super(marca, modelo, serie, material, resolucionPantalla, bluetooth, reproduccionAudio);

        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.procesador = procesador;
        this.RAM = RAM;
        this.camara = camara;
        this.memoria = memoria;
        this.wiFi = wiFi;
        this.sincronizacionPC = sincronizacionPC;
    }
}

