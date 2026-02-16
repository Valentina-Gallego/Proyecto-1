public class objVehiculo {
    private String Marca;
    private String Tipo;
    private int NumeroCelda;
    private int Cilindraje;
    private double PagoAnterior;
    private double PagoActual;
    public objVehiculo(String marca, String tipo, int numeroCelda, int cilindraje, double pagoAnterior,
            double pagoActual) {
        Marca = marca;
        Tipo = tipo;
        NumeroCelda = numeroCelda;
        Cilindraje = cilindraje;
        PagoAnterior = pagoAnterior;
        PagoActual = pagoActual;
    }
    public objVehiculo() {
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public int getNumeroCelda() {
        return NumeroCelda;
    }
    public void setNumeroCelda(int numeroCelda) {
        NumeroCelda = numeroCelda;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public double getPagoAnterior() {
        return PagoAnterior;
    }
    public void setPagoAnterior(double pagoAnterior) {
        PagoAnterior = pagoAnterior;
    }
    public double getPagoActual() {
        return PagoActual;
    }
    public void setPagoActual(double pagoActual) {
        PagoActual = pagoActual;
    }
    

    
}
