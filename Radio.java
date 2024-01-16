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
        state = false;
        aM = true;

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
public boolean isOn(boolean state){
    if (state == true){
        return true;
    }
    else {
        return false;
    }

}


/**Metodo para encender y apagar el radio
 * @return void
 */
public void switchOnOff(){
    if (state == false){
        state = true;
    }
    else if (state == true){
        state = false;
    }
}

/**El metodo verifica si el radio esta en la estacion AM o FM
 * @param AM
 */
public boolean isAM(boolean aM){
    if (aM == true){
        return true;
    }
    else {
        return false;
    }
}

/**Metodo para cambiar de estacion de AM a FM
 *@return void
 */
public void switchAMFM(){
    

}

}
