public class ejemploCondicionales {
    public static void main(String[] args) {
        System.out.println("hello word");
        // if es la palabra reservada para los condicionales
        int edad = 17;
        int cantidad = 2;
        // en java es obligatorio declarar la evaluacion dentro de unos parentesis.
        // el operador => no es lo mismo que >=, el priermo se utiliza en la sintaxis especifica en java.
        if (edad >= 18){//en ceirtos casos podemos obiar las lllaves, en  os casos donde la liena inmediata a if sea la q tenemos de ejecutar. como en este bloque de codigo.
            System.out.println("usted puede entrar");
        }
        else {
            if (cantidad >= 2){
                System.out.println("usted es menor de  " + "edad pero esta permitido el ingreso" );
            }
            System.out.println("usted no puede entrar");
        }
        System.out.println("bienvenido");
    }
}
