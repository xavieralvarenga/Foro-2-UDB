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
    public String getDetalles() {
        return super.getDetalles() + "\nMemoria: " + memoria +
               "\nTarjeta Gráfica: " + tarjetaGrafica + "\nTamaño de Torre: " + tamanoTorre;
    }
}
