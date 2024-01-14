/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Atrivutos y listas
public class Radio {
    private static Scanner teclado = new Scanner(System.in);
    ArrayList<Integer> buttonAM = new ArrayList<>(Arrays.asList(560, 610, 670, 730, 760, 790, 820, 850, 880, 910, 940, 970));
    ArrayList<Double> buttonFM = new ArrayList<>(Arrays.asList(91.3, 91.7, 92.1, 92.5, 92.9, 93.3, 93.7, 93.9, 94.1, 94.5, 94.9, 95.3));
    private static boolean state;
    private boolean AM;
    private boolean FM;
    private double stationAM;
    private double stationFM;

//Constructor
public Radio(ArrayList<Integer> buttonAM, ArrayList<Double> buttonFM, boolean state, boolean Am, boolean Fm,
            double stationAM, double stationFM) {
        this.buttonAM = buttonAM;
        this.buttonFM = buttonFM;
        this.state = state;
        AM = Am;
        FM = Fm;
        this.stationAM = stationAM;
        this.stationFM = stationFM;
    }


/**Metodo para verificar si el radio esta encendido u apagado
 * @param state
 */
public static void isOn(boolean state){
    if (state == true){
        System.out.print("El radio esta encendio");
    }

    else if (state == false){
        System.out.println("El radio esta apagado");
    }
}


/**Metodo para encender y apagar el radio
 * @param state
 */
public static void switchOnOff(){
    System.out.println("Precione el boton segun lo que desee");
    System.out.println("1. On");
    System.out.println("2. Off");
    int menuInicial = teclado.nextInt();

    switch (menuInicial) {
        case 1:
            state = true;
            System.out.println("El radio esta encendido");
            break;
        
            case 2:
            state = false;
            System.out.println("El radio esta apagado");
    
        default:
            System.out.println("El boton seleccionado no pertenece a la lista de opciones");
            break;
    }

}

}
