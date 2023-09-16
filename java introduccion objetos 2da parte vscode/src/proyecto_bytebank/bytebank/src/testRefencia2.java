public class testRefencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "9750123";
        diego.telefono = "65789321";
        Cuenta cuentaDediego = new Cuenta();
        cuentaDediego.agencia = 1;
        cuentaDediego.titular = diego;
        System.out.println(cuentaDediego.titular.documento);
    }
}
