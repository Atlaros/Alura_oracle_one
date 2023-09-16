// en java en la progracion orientada a objetos definimos como metodo las sequencias d epasos para realizar una cosa o accion. los metodos pueden como tambine no pueden recibir m  parametro. que son los parametros es la inforamcion necesaria que ese metodo necesita usar. 
public class pruebaMetodos {
    public static void main(String[] args) {
        
        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 300;
        miCuenta.depositar(200);
        System.out.println(miCuenta.saldo);

        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo); 

        Cuenta cuantaDeJimena = new Cuenta();
        cuantaDeJimena.depositar(1000);
        boolean puedeTransferir = cuantaDeJimena.trasferir(400, miCuenta);
        if(puedeTransferir){
            System.out.println("transferencia existosa");
        }
        else {
            System.out.println("no es posible");
        }
        //tambine podemos psar objetos como parametros.
        cuantaDeJimena.trasferir(400, miCuenta);
        System.out.println(cuantaDeJimena.saldo); 
        System.out.println(miCuenta.saldo); 
    }
}
