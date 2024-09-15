import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // En este método se instanciará los objetos

        String nombreUsuario = JOptionPane.showInputDialog("Por favor, ingresa tu nombre");
        Object[] equipos = {"Desktops", "Laptops", "Tablets"};
        Object seleccionEquipos;
        JOptionPane.showMessageDialog(null, "Bienvenido, " + nombreUsuario);

        boolean salir = false;
        int seleccion;

        do {
            Object[] opciones = {"Registrar equipo.", "Ver equipos", "Salir"};
            seleccion = JOptionPane.showOptionDialog(null,
                    "¿Qué deseas realizar?",
                    "Menú Principal",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (seleccion) {
                case 0:
                    seleccionEquipos = JOptionPane.showInputDialog(
                            null,
                            "Selecciona el equipo a registrar: ",
                            "Registro de producto",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            equipos,
                            equipos[0]);
                    // Aquí agregar el código para registrar el equipo seleccionado
                    break;
                case 1:
                    seleccionEquipos = JOptionPane.showInputDialog(
                            null,
                            "Selecciona los equipos que quieres visualizar: ",
                            "Vista de productos",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            equipos,
                            equipos[0]);
                    // Aquí agregar el código para visualizar los equipos seleccionados
                    break;
                case 2:
                    int confirmacion = JOptionPane.showConfirmDialog(null,
                            "¿Estás seguro de que deseas salir?",
                            "Confirmar salida",
                            JOptionPane.YES_NO_OPTION);
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        salir = true;
                    }
                    break;
                default:
                    // Si el usuario cierra el diálogo o presiona cancelar
                    salir = true;
                    break;
            }
        } while (!salir);
    }
}

