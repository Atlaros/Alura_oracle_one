public class TipoVariable {
    public static void main(String[] args) {
        System.out.println("hola mundo!!!");
        /*java es tipo de leguaje muy tipado, hya asignar un variable segun el tipo de dato q vamos usar para enteros existe int */
        /*int edad = 28;*/
        /*las palabras de coloar turquesa son palabras reservadas de java, no podemos usarlas */
        /*System.out.println(edad);
        edad = 47;
        System.out.println(edad);
        edad = 45+98;
        System.out.println("mi edad es " + edad);*/
        double salario = 1250.50;
        System.out.println(salario);
        double edad = 28;
        System.out.println(edad);
        /*int salario = 1250.5;*/
        /*java no me deja declarar una variable dos veces. se puede sobreescribir */
        double salarioMitad = salario/2;
        System.out.println(salarioMitad);
        /*System.out.println(division);/*java no me deja imprimero usarlas la variable sin antes declararla */
        int division = 1250/3;/*la palabra reservada int permite ahcer divisiones. redondea la division */
        System.out.println(division);
        double variable1 = 230.89;
        int variable1Entero = (int) variable1;/*en java tenemos algo llamado cast, nos permite forzar el cambio de variable */
        System.out.println(variable1Entero);//230.89 se convierte  aun nro entero 230
        //la palabra reservada int solo soporta una cantidad de 32bytes esto quiere decir que soparota 2elevado a las 31 possitivo y 2 elevado a las -31. 
        //por eso tenemos la palabra reservada long que soporta 2 alevado a las 64 bytes
        // long prueba = 12222222222L; colocamos la L, para especificar que e sun nro grande, un nro long.
        //short es un tipo palabra reservada  que soporta nro pequeños 2 elevada a las 16
        //byte es un palabra servada que soporta un nro de 8 byte, 2 elevado a la 8.
        //float es una palabara reservada que soporta decimales de nro pequeños
        // sumando variables
        double resultado = variable1 + variable1Entero;
        System.out.println(resultado);
        int resultado2 = (int) variable1 + variable1Entero;
        System.out.println(resultado2);
    }
}