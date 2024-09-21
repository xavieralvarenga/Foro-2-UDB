import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Lista para almacenar los equipos
        ArrayList<Equipo> listaEquipos = new ArrayList<>();

        String nombreUsuario = JOptionPane.showInputDialog("Por favor, ingresa tu nombre");
        Object[] equipos = {"Desktops", "Laptops", "Tablets"};
        Object seleccionEquipos;
        JOptionPane.showMessageDialog(null, "Bienvenido, " + nombreUsuario);

        boolean salir = false;
        int seleccion;

        do {
            Object[] opciones = {"Registrar equipo", "Ver equipos", "Salir"};
            seleccion = JOptionPane.showOptionDialog(null,
                    "¿Qué deseas realizar?",
                    "Menú Principal",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (seleccion) {
                case 0: // Registrar equipo
                    seleccionEquipos = JOptionPane.showInputDialog(
                            null,
                            "Selecciona el equipo a registrar: ",
                            "Registro de producto",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            equipos,
                            equipos[0]);
                    if (seleccionEquipos != null) {
                        registrarEquipo((String) seleccionEquipos, listaEquipos);
                    }
                    break;
                case 1: // Ver equipos
                    seleccionEquipos = JOptionPane.showInputDialog(
                            null,
                            "Selecciona los equipos que quieres visualizar: ",
                            "Vista de productos",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            equipos,
                            equipos[0]);
                    if (seleccionEquipos != null) {
                        verEquipos((String) seleccionEquipos, listaEquipos);
                    }
                    break;
                case 2: // Salir
                    int confirmacion = JOptionPane.showConfirmDialog(null,
                            "¿Estás seguro de que deseas salir?",
                            "Confirmar salida",
                            JOptionPane.YES_NO_OPTION);
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        salir = true;
                    }
                    break;
                default:
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    private static void registrarEquipo(String tipoEquipo, ArrayList<Equipo> listaEquipos) {
        String fabricante = getInput("Fabricante:");
        String modelo = getInput("Modelo:");
        String procesador = getInput("Procesador:");
        String hardisk = getInput("Disco Duro:");
        float pantalla = Float.parseFloat(getInput("Tamaño de Pantalla:"));
    
        switch (tipoEquipo) {
            case "Desktops":
                String memoriaD = getInput("Memoria:");
                String tarjetaGrafica = getInput("Tarjeta gráfica:");
                String tamanoTorre = getInput("Tamaño de torre:");
    
                listaEquipos.add(new Desktop(fabricante, modelo, procesador, hardisk, pantalla, memoriaD, tarjetaGrafica, tamanoTorre));
                break;
            case "Laptops":
                String memoriaL = getInput("Memoria:");
    
                listaEquipos.add(new Laptop(fabricante, modelo, procesador, hardisk, pantalla, memoriaL));
                break;
            case "Tablets":
                String tipoPantalla = getInput("Tipo de Pantalla (Capacitiva/Resistiva):");
                String sistemaOperativo = getInput("Sistema Operativo:");
    
                listaEquipos.add(new Tablet(fabricante, modelo, procesador, hardisk, pantalla, tipoPantalla, sistemaOperativo));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de equipo no reconocido.");
                return;
        }
    
        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(null, "El equipo ha sido registrado exitosamente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Method to validate input
    private static String getInput(String message) {
        String input;
        do {
            input = JOptionPane.showInputDialog(message);
            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío. Por favor, ingrese un valor válido.", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
            }
        } while (input == null || input.trim().isEmpty());
        return input;
    }
    
    private static void verEquipos(String tipoEquipo, ArrayList<Equipo> listaEquipos) {
        StringBuilder equiposInfo = new StringBuilder();
    
        for (Equipo equipo : listaEquipos) {
            if (equipo.getTipo().equalsIgnoreCase(tipoEquipo)) {
                equiposInfo.append(equipo.toString())
                           .append("\n---------------------------------\n");
            }
        }
    
        if (equiposInfo.length() > 0) {
            JOptionPane.showMessageDialog(null, equiposInfo.toString(), "Lista de " + tipoEquipo, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay equipos de tipo " + tipoEquipo + " registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    

}
