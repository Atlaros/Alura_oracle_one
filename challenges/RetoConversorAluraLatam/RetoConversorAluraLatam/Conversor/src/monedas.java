
import javax.swing.JOptionPane;

public class monedas {

    private double Bolivianos;
    private double dolar;
    private double euro;
    private double libras;
    private double yen;
    private double wonCoreano;
    private double valorGeneral;

    public monedas() {
        this.dolar = 6.96;
        this.euro = 7.67;
        this.libras = 8.86;
        this.wonCoreano = 0.00546 ;
        this.yen = 6.85;
    }

    public void setMoneda(String moneda, double valor) {
        if (valor >= 0) {
            switch (moneda) {
                case "Bs":
                	setBolivianos(valor);
                    break;
                case "dolar":
                    setDolar(valor);
                    break;
                case "euro":
                    setEuro(valor);
                    break;
                case "libras":
                    setLibras(valor);
                    break;
                case "yen":
                    setYen(valor);
                    break;
                case "wonCoreano":
                    setWon_coreano(valor);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Moneda no válida");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Moneda no válida");
        }
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public void setLibras(double libras) {
        this.libras = libras;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }

    public void setWon_coreano(double won_coreano) {
        this.wonCoreano = won_coreano;
    }

    public double getValorGeneral() {
        return valorGeneral;
    }

    public void setValorGeneral(double valorGeneral) {
        if (valorGeneral > 0) {
            this.valorGeneral = valorGeneral;
        } else {
            this.valorGeneral = 0;
        }
    }

    public void setBolivianos(double Bolivianos) {
        this.Bolivianos = Bolivianos;
    }

    public double getLibras() {
        return libras;
    }

    public double getYen() {
        return yen;
    }

    public double getWon_coreano() {
        return wonCoreano;
    }

    public double getEuro() {
        return euro;
    }

    public double getBolivianos() {
        return Bolivianos;
    }

    public double getDolar() {
        return dolar;
    }

}
