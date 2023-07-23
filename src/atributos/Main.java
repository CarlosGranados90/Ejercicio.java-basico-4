package atributos;

import herencia.SmartPhone;
import herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

    SmartPhone Iphone = new SmartPhone();

    SmartPhone Android = new SmartPhone("Motorola", "Moto g9 Play", "86413454E5413",
            "Plástico", "720 x 1600 pixels", "V 4", "Google Play Music Manager",
            "Android", "16.5 cm", "Snapdragon 662", "4 GB", "48 megapíxeles",
            "128 GB", "802.11a/b/g/n", "Cable de datos");

        System.out.println("Datos SmartPhone");
        System.out.println("Marca: " + Android.marca);
        System.out.println("Modelo: " + Android.modelo);
        System.out.println("Serie: " + Android.serie);
        System.out.println("Material: " + Android.material);
        System.out.println("Resolución pantalla: " + Android.resolucionPantalla);
        System.out.println("Bluetooth: " + Android.bluetooth);
        System.out.println("Reproducción audio: " + Android.reproduccionAudio);
        System.out.println("Sistema operativo: " + Android.sistemaOperativo);
        System.out.println("Tamaño pantalla: " + Android.tamanoPantalla);
        System.out.println("Procesador: " + Android.procesador);
        System.out.println("Memoria RAM: " + Android.RAM);
        System.out.println("Camara: " + Android.camara);
        System.out.println("Memoria: " + Android.memoria);
        System.out.println("Wi-Fi: " + Android.wiFi);
        System.out.println("Sincronización PC: " + Android.sincronizacionPC);


    SmartWatch Xiaomi = new SmartWatch();

    SmartWatch Samsung = new SmartWatch("Samsung", "Galaxy Watch 46 MM Plata",
            "SWS134523465","Plástico", "360 x 360", "768 MB",
            "Galaxy Wearable", "Intercambiable",
            "Acelerómetro, giroscopio, barómetro, HRM, luz ambiental",
            "Android 5.0 o posterior / iPhone 5 o superior, iOS 9.0 o superior");


        System.out.println("Datos SmartWatch");
        System.out.println("Marca: " + Samsung.marca);
        System.out.println("Modelo: " + Samsung.modelo);
        System.out.println("Serie: " + Samsung.serie);
        System.out.println("Material: " + Samsung.material);
        System.out.println("Resolución pantalla: " + Samsung.resolucionPantalla);
        System.out.println("Bluetooth: " + Samsung.bluetooth);
        System.out.println("Reproducción audio: " + Samsung.reproduccionAudio);
        System.out.println("Correa: " + Samsung.correa);
        System.out.println("Sensores: " + Samsung.sensores);
        System.out.println("Compatibilidad: " + Samsung.compatibilidad);

    }
}