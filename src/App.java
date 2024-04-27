import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        String menu1 = "¡¡Bienvenido al conversor de divisas!!\n1.Nuevo cambio\n2.Historial de cambios\n9.Salir";
        conexion cx = new conexion();
        cx.prueba();

        while(opcion != 9){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu1));
            switch (opcion) {
                case 1:
                    
                    break;
                
                case 2:
                
                    break;
        
                default:
                    break;
            }
        }
    }
}
