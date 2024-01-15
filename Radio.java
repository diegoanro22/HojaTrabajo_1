/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Objects;

//Atributos y listas
public class Radio {
    private boolean state;
    private boolean aM;
    private double stationAM;
    private double stationFM;
    private ArrayList<Double> stationsAM = new ArrayList<>();
    private ArrayList<Double> stationsAF = new ArrayList<>();

//Constructor
    public Radio(boolean state, boolean aM, double stationAM, double stationFM, ArrayList<Double> stationsAM, ArrayList<Double> stationsAF) {
        this.state = state;
        this.aM = aM;
        this.stationAM = stationAM;
        this.stationFM = stationFM;
        this.stationsAM = stationsAM;
        this.stationsAF = stationsAF;
    }

    public Radio() {
    }

    public boolean isState() {
        return this.state;
    }

    public boolean getState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getAM() {
        return this.aM;
    }

    public void setAM(boolean aM) {
        this.aM = aM;
    }

    public double getStationAM() {
        return this.stationAM;
    }

    public void setStationAM(double stationAM) {
        this.stationAM = stationAM;
    }

    public double getStationFM() {
        return this.stationFM;
    }

    public void setStationFM(double stationFM) {
        this.stationFM = stationFM;
    }

    public ArrayList<Double> getStationsAM() {
        return this.stationsAM;
    }

    public void setStationsAM(ArrayList<Double> stationsAM) {
        this.stationsAM = stationsAM;
    }

    public ArrayList<Double> getStationsAF() {
        return this.stationsAF;
    }

    public void setStationsAF(ArrayList<Double> stationsAF) {
        this.stationsAF = stationsAF;
    }

    public Radio state(boolean state) {
        setState(state);
        return this;
    }

    public Radio aM(boolean aM) {
        setAM(aM);
        return this;
    }

    public Radio stationAM(double stationAM) {
        setStationAM(stationAM);
        return this;
    }

    public Radio stationFM(double stationFM) {
        setStationFM(stationFM);
        return this;
    }

    public Radio stationsAM(ArrayList<Double> stationsAM) {
        setStationsAM(stationsAM);
        return this;
    }

    public Radio stationsAF(ArrayList<Double> stationsAF) {
        setStationsAF(stationsAF);
        return this;
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
 * @return void
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

/**El metodo verifica si el radio esta en la estacion AM o FM
 * @param AM
 */
public static void isAM(boolean AM){
    if (AM == true){
        System.out.println("El radio esta en la estación AM");
    }
    else if (AM == false){
        System.out.println("El radio esta en la estación FM");
    }

}

/**Metodo para cambiar de estacion de AM a FM
 *@return void
 */
public static void switchAMFM(){
    System.out.println("Selecciones la estación");
    System.out.println("1. AM");
    System.out.println("2. FM");
    int selectorEstacion = teclado.nextInt();

    switch (selectorEstacion) {
        case 1:
            System.out.println("Esta en la estación AM");
            System.out.println("Actualmente se encuentra en la frecuencia" + buttonAM.get(0));
            break;

        case 2: 
            System.out.println("Esta en la estacion FM");
            System.out.println("Actualmente se encuentra en la frecuencia" + buttonFM.get(0));
            break;
    
        default:
            System.out.println("La opcion seleccionada no esta en la lista de opciones");
            break;
    }

}

}
