public class testReferencia {
    
    public static void main(String[] args) {
        Cuenta primerCuenta = new Cuenta();
        primerCuenta.saldo = 200;
        Cuenta segundaCuenta = primerCuenta;
        segundaCuenta.saldo = 100;
        System.out.println("saldo primera cuenta " + "cunta" + primerCuenta.saldo);
        System.out.println("saldo segunda cuenta " + "cuenta" + segundaCuenta.saldo);
        segundaCuenta.saldo += 400;
        System.out.println("saldo primera cuenta " + "cuenta" + primerCuenta.saldo);
    }
}
