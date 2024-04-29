import java.time.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static String date(){
        String fechaHora = "";
        LocalDateTime lc = LocalDateTime.now();
        fechaHora += "("+lc.getHour()+":"+lc.getMinute()+" - "+lc.getDayOfMonth()+"/"+lc.getMonthValue()+"/"+lc.getYear()+")";
        return fechaHora;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<String> historial = new ArrayList<>();
        int opcion = 0;
        String menu;
        Moneda coin = new Moneda();
        conexion cx = new conexion();
        cx.prueba();
        

        while(opcion != 9){
            menu = "¡¡Bienvenido al conversor de divisas!!\n1.Nuevo cambio\n2.Historial de cambios\n9.Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            String cambio;
            String mensaje;
            int colon;
            Double result;
            String json = cx.prueba().body();;
            switch (opcion) {
                case 1:
                    menu = "1.Colones a Dolares(USD)\n2.Colones a Euros(EUR)\n3.Colones a Libras(GBP)\n4.Colones a Yen(JPY)\n5.Colones a Cordobas(NIO)\nSeleccione una opcion:";
                    int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
                    switch (opcion1) {
                        case 1:
                            colon = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                            cambio = "USD";
                            result = coin.consulta(json, colon, cambio);
                            mensaje = "El cambio de "+colon+" CRC es de "+result+" "+cambio;
                            JOptionPane.showMessageDialog(null, mensaje);
                            historial.add(mensaje+" - "+date()+"\n");
                            break;
                        case 2:
                            colon = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                            cambio = "EUR";
                            result = coin.consulta(json, colon, cambio);
                            mensaje = "El cambio de "+colon+" CRC es de "+result+" "+cambio;
                            JOptionPane.showMessageDialog(null, mensaje);
                            historial.add(mensaje+" - "+date()+"\n");
                            break;
                        case 3:
                            colon = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                            cambio = "GBP";
                            result = coin.consulta(json, colon, cambio);
                            mensaje = "El cambio de "+colon+" CRC es de "+result+" "+cambio;
                            JOptionPane.showMessageDialog(null, mensaje);
                            historial.add(mensaje+" - "+date()+"\n");
                            break;
                        case 4:
                            colon = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                            cambio = "JPY";
                            result = coin.consulta(json, colon, cambio);
                            mensaje = "El cambio de "+colon+" CRC es de "+result+" "+cambio;
                            JOptionPane.showMessageDialog(null, mensaje);
                            historial.add(mensaje+" - "+date()+"\n");
                            break;
                        case 5:
                            colon = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad"));
                            cambio = "NIO";
                            result = coin.consulta(json, colon, cambio);
                            mensaje = "El cambio de "+colon+" CRC es de "+result+" "+cambio;
                            JOptionPane.showMessageDialog(null, mensaje);
                            historial.add(mensaje+" - "+date()+"\n");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case 2:
                    mensaje = "";
                    for(int i=0; i<historial.size(); i++){
                        mensaje += historial.get(i);
                    }
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "¡¡Gracias por su visita!!\nVuelva pronto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
