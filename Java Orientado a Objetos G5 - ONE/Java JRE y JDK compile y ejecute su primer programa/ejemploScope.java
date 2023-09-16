
public class ejemploScope {

    public static void main(String[] args) {
        System.out.println("hello word");
        
        int edad = 17;
        int cantidadPersonas = 2;
        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;
        System.out.println("el valor de la pareja es " + esPareja);
        if (puedeEntrar){
            System.out.println("sea bienvenido");

        }
        else {
            System.out.println("usted no puede entrar");
        }
    }
}
