public abstract class Equipo {
    // Clase base para aplicar Herencia
    protected String fabricante;
    protected String modelo;
    protected String procesador;
    protected String hardisk;
    protected float pantalla; // Indica el tamaño de la pantalla

    public Equipo(String fabricante, String modelo, String Procesador, String hardisk, float pantalla) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.procesador = Procesador;
        this.hardisk = hardisk;
        this.pantalla = pantalla;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Fabricante: " + fabricante + "\n" +
                "Modelo: " + modelo + "\n" +
                "Procesador: " + procesador + "\n" +
                "Disco Duro: " + hardisk + "\n" +
                "Pantalla: " + pantalla;
    }
}