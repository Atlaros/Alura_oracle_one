public class ejemploCaracteres {
    public static void main(String[] args) {
        //la palabra reservada char solo acepta un solo caracter o un solo nro
        char caracter = 'a';//para definir un valor usamos comillas simples para string
        System.out.println(caracter);
        //caracter = 'ab';// si queremos sobreescribir caracter, al estar definido como char solo soporta un caracter.
        //existe una tabla asqui que los nro puede represtar un caractar para char.
        caracter = 65;
        System.out.println(caracter);// nos mostraria la letra A mayuscula.
        caracter = 64 + 1;//nos daria un nro para caracter en char
        //char segundoCaracter = caracter + 1;// estamos sumando dos varibles una tipo char y otra tipo entero, java en estos casos nos va devolver la variable con el nro mas grande,
        //tampoco podria complilar java no puede convertir de entero a char
        char segundoCaracter = (char) + (caracter + 1);//castemos para qe la operacion arimetica sea tipo char
        System.out.println(segundoCaracter);
        //hasta el momento solo hemos estado viendo tipos de vairbles primitivos
        //string es un obejto
        String palabra = "cursos alura onlien";
        System.out.println(palabra);
        palabra = palabra + 2020;
        System.out.println(palabra);
    }
}
