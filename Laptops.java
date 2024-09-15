// Subclase Laptop
class Laptop extends Equipo {
    private String memoria;

    public Laptop(String fabricante, String modelo, String Procesador, String hardisk, float pantalla,
                  String memoria) {
        super(fabricante, modelo, Procesador, hardisk, pantalla);
        this.memoria = memoria;
    }

    @Override
    public String getDetalles() {
        return super.getDetalles() + "\nMemoria: " + memoria;
    }
}