public class Desktops extends Equipo{
    private int RAM; //Memoria RAM
    private String Grafica;
    private float sizeCase; //Tamaño de la torre

    public Desktops(String fabricante, String modelo, String Procesador, String hardisk, float pantalla, int ram, String grafica, float sizecase) {
        super(fabricante, modelo, Procesador, hardisk, pantalla);
        this.RAM = RAM;
        this.Grafica = grafica;
        this.sizeCase = sizecase;
    }
    //Subclase

}
