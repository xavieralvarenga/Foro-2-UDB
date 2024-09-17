//subclase Desktop
class Desktop extends Equipo {
    private String memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;

    public Desktop(String fabricante, String modelo, String Procesador, String hardisk, float pantalla,
                   String memoria, String tarjetaGrafica, String tamanoTorre) {
        super(fabricante, modelo, Procesador, hardisk, pantalla);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
    }

    @Override
    public String getTipo(){
        return "Desktops";
    }

    @Override
    public String toString() {
        return super.toString() + "Memoria: " + memoria + "\n" +
                "Tarjeta Gráfica: " + tarjetaGrafica + "\n" +
                "Tamaño Torre: " + tamanoTorre + "\n";
    }
}
