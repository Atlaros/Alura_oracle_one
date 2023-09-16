import java.io.ObjectInputStream.GetField;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class pruebaAcceso {
    
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(400);
        cuenta.retirar(300); 
        System.out.println(cuenta.getSaldo());
    }

}