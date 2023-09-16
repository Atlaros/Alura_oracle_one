
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConversorMonedas {

    SeleccionOpciones menuOpciones = new SeleccionOpciones();
    monedas monedaCambio = new monedas();
    DecimalFormat formato = new DecimalFormat("#.00"); //formatea el double a 2 decimales

    public void mensaje(String monedaElegida, double valorObtenido, String monedaConvertida, double resultadoFinal) {
        String resultadoConvertido = formato.format(resultadoFinal);
        String mensajeFinal = "La cantidad de " + valorObtenido + " " + monedaElegida + " es igual a " + resultadoConvertido + " " + monedaConvertida;
        JOptionPane.showMessageDialog(null, mensajeFinal);        
        menuOpciones.continuar();
    }

    public void monedaToPesos(double moneda, String monedaElegida, double valorObtenido, String validarMoneda) {
        double totalConvertido = valorObtenido * moneda;
        monedaCambio.setMoneda("Bs", totalConvertido);//set Bolivianos
        monedaCambio.setMoneda(validarMoneda, valorObtenido);//set para la moneda que convierte
        mensaje(monedaElegida, valorObtenido, "Bolivianos", totalConvertido);
        
    }

    public void pesosToMoneda(double moneda, String monedaElegida, String validarMoneda) {
        monedaCambio.setMoneda("Bs", monedaCambio.getValorGeneral());//set para Bolivianos
        double pesosColombianos = monedaCambio.getBolivianos();
        double totalConvertido = pesosColombianos / moneda;
        monedaCambio.setMoneda(validarMoneda, totalConvertido);//set para la moneda a convertir
        mensaje("Bolivianos", pesosColombianos, monedaElegida, totalConvertido);
    }

    public void eleccionMoneda() {
        Object[] options = {"De Bs a Dolar", "De Bs a Euro",
            "De Bs a Libras", "De Bs a Yen", "De Bs a Won Coreano",
            "De Dolar a Bs", "De Euro a Bs", "De Libras a Bs",
            "De Yen a Bs", "De Coreano a Bs"};

        String selectedOption = (String) JOptionPane.showInputDialog(null, "Elije la moneda a convertir", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if (selectedOption != null) {//selecionana una opcion funciona
            switch (selectedOption) {
                case "De Bs a Dolar":
                    pesosToMoneda(monedaCambio.getDolar(), "Dólares", "dolar");
                    break;
                case "De Bs a Euro":
                    pesosToMoneda(monedaCambio.getEuro(), "Euros", "euro");
                    break;
                case "De Bs a Libras":
                    pesosToMoneda(monedaCambio.getLibras(), "Libras", "libras");
                    break;
                case "De Bs a Yen":
                    pesosToMoneda(monedaCambio.getYen(), "Yenes", "yen");
                    break;
                case "De Bs a Won Coreano":
                    pesosToMoneda(monedaCambio.getWon_coreano(), "Wones", "won_coreano");
                    break;
                case "De Dolar a Bs":
                    monedaToPesos(monedaCambio.getDolar(), "Dólares", monedaCambio.getValorGeneral(), "dolar");
                    break;
                case "De Euro a Bs":
                    monedaToPesos(monedaCambio.getEuro(), "Euros", monedaCambio.getValorGeneral(), "euro");
                    break;
                case "De Libras a Bs":
                    monedaToPesos(monedaCambio.getLibras(), "Libras", monedaCambio.getValorGeneral(), "libras");
                    break;
                case "De Yen a Bs":
                    monedaToPesos(monedaCambio.getYen(), "Yenes", monedaCambio.getValorGeneral(), "yen");
                    break;
                case "De Coreano a Bs":
                    monedaToPesos(monedaCambio.getWon_coreano(), "Wones", monedaCambio.getValorGeneral(), "won_coreano");
                    break;
            }
        } else {//si el si ceirra sin que le usuarion no elegina una opcion
            JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
        }
    }

    public void conversionMoneda() {
        JTextField textField = new JTextField();
        Object[] message = {
            "Cantidad a convertir:", textField
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Conversión de moneda", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String valorRecibido = textField.getText();
            if (!valorRecibido.trim().isEmpty()) {
                try {
                    int valorDigitado = Integer.parseInt(valorRecibido);
                    if (valorDigitado > 0) {
                        monedaCambio.setValorGeneral(valorDigitado);
                        eleccionMoneda();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: cantidad ingresada no válida", "Error de entrada",
                                JOptionPane.ERROR_MESSAGE);
                        conversionMoneda();
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: valor ingresado no válido", "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    conversionMoneda();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: No ingresaste ningún valor", "Error de entrada",
                        JOptionPane.ERROR_MESSAGE);
                conversionMoneda();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Saliste del programa", "Programa finalizado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
