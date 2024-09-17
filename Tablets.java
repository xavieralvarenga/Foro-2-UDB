// Subclase Tablet
class Tablet extends Equipo {
    private String tipoPantalla;
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, String Procesador, String hardisk, float pantalla,
                  String tipoPantalla, String sistemaOperativo) {
        super(fabricante, modelo, Procesador, hardisk, pantalla);
        this.tipoPantalla = tipoPantalla;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String getTipo(){
        return "Tablets";

    }

    @Override
    public String toString() {
        return super.toString() + "Tipo Pantalla: " + tipoPantalla + "\n" +
                "Sistema Operativo: " + sistemaOperativo + "\n";
    }
}