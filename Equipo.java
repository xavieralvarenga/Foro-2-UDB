public class Equipo {
    // Clase base para aplicar Herencia
    protected String Fabricante;
    protected String Modelo;
    protected String Procesador;
    protected String Hardisk;
    protected float Pantalla; // Indica el tamaño de la pantalla

    public Equipo(String fabricante, String modelo, String Procesador, String hardisk, float pantalla) {
        this.Fabricante = fabricante;
        this.Modelo = modelo;
        this.Procesador = Procesador;
        this.Hardisk = hardisk;
        this.Pantalla = pantalla;
    }

    public String getDetalles() {
        return "Fabricante: " + Fabricante + "\nModelo: " + Modelo +
               "\nProcesador: " + Procesador + "\nDisco Duro: " + Hardisk +
               "\nPantalla: " + Pantalla + "\"";
    }
}
