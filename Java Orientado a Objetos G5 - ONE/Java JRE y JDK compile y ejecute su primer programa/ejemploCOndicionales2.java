public class ejemploCOndicionales2 {
    //vamos mejoarar el codigo, con las buenas practicas
    public static void main(String[] args) {
        System.out.println("hello word");
        
        int edad = 17;
        int cantidadPersonas = 2;
        //boolean es un palabra reservada de java y es del tipo premitivo. solo puede almacenar dos valores true y false. java a diferencia de otros leguajes no sobre entiende que vale true o false, es esneceario colocarlo
        // en java en las expreciones booleana tiene q tener una exprecion tru o false.
        // en java si queremos evaluar una condcion tiene q ser un booleano.
        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;
        System.out.println("el valor de la pareja es " + esPareja);
        // dos || es el condicional or 
        // si quisieramos decir que solo puede entrar mayores de 18 y acompañado de una pareja
        //if (edad >= 18 && esPareja /* la exprecion de la condicion es exprecion booleana ya definimos que la varaibel es true*/ ){
        //if (edad >= 18 && esPareja)
        //if (edad >= 18 || cantidadPersonas >= 2)
        //if (edad >= 18 && cantidadPersonas >= 2)
        if (puedeEntrar){
            System.out.println("sea bienvenido");

        }
        else {
            System.out.println("usted no puede entrar");
        }
    }
}
