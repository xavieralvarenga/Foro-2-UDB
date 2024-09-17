// Subclase Laptop
class Laptop extends Equipo {
    private String memoria;

    public Laptop(String fabricante, String modelo, String Procesador, String hardisk, float pantalla,
                  String memoria) {
        super(fabricante, modelo, Procesador, hardisk, pantalla);
        this.memoria = memoria;
    }

    @Override
    public String getTipo(){
        return "Laptops";
    }


    @Override
    public String toString() {
        return super.toString() + "Memoria: " + memoria + "\n";
    }
}