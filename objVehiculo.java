public class objVehiculo {
    private String Marca;
    private String Tipo;
    private int Celda;
    private int Cilindraje;
    private double PagoAnterior;
    private double PagoActual;
    public objVehiculo(String marca, String tipo, int celda, int cilindraje, double pagoAnterior, double pagoActual) {
        Marca = marca;
        Tipo = tipo;
        Celda = celda;
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
    public int getCelda() {
        return Celda;
    }
    public void setCelda(int celda) {
        Celda = celda;
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
