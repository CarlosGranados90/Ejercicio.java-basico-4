package atributos;

public class SmartDevice {

    // atributos
    protected String marca;
    protected String modelo;
    protected String serie;
    protected String material;
    protected String resolucionPantalla;
    protected String bluetooth;
    protected String reproduccionAudio;


    // constructor vacio
    public SmartDevice() {}

    // constructor atributos
    public SmartDevice (String marca, String modelo, String serie, String material,
                        String resolucionPantalla, String bluetooth, String reproduccionAudio){

        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.material = material;
        this.resolucionPantalla = resolucionPantalla;
        this.bluetooth = bluetooth;
        this.reproduccionAudio = reproduccionAudio;

    }

}
