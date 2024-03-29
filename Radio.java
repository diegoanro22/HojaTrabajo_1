/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

//Atributos y listas
public class Radio implements IRadio {
    private boolean state;
    private boolean aM;
    private double stationAM;
    private double stationFM;
    private ArrayList<Double> stationsAM = new ArrayList<>(Collections.nCopies(12, 0.0));
    private ArrayList<Double> stationsFM = new ArrayList<>(Collections.nCopies(12, 0.0));

//Constructor
    public Radio(boolean state, boolean aM, double stationAM, double stationFM, ArrayList<Double> stationsAM, ArrayList<Double> stationsFM) {
        this.state = state;
        this.aM = aM;
        this.stationAM = stationAM;
        this.stationFM = stationFM;
        this.stationsAM = stationsAM;
        this.stationsFM = stationsFM;
    }

    public Radio() {
        state = false;
        aM = true;
        stationAM = 530;
        stationFM = 87.9;
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
        return this.stationsFM;
    }

    public void setStationsAF(ArrayList<Double> stationsFM) {
        this.stationsFM = stationsFM;
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
public boolean isOn(){
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
    state = !state;
}


/**El metodo verifica si el radio esta en la estacion AM o FM
 * @param aM
 */
public boolean isAM(){
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
public void switchAMFM() {
    aM = !aM; 
}

/** Metodo para cambiar de estacion
 * @retun double
 */
public double nextStation(){
    if (isAM()) {
        stationAM += 10;
        if (stationAM > 1610) {
            stationAM = 530;
        }
        return stationAM;
    } else {
        stationFM += 0.2;
        if (stationFM > 108) {
            stationFM = 87.9;
        }
        return stationFM;
    }
}


/** Metodo para guardar la estacion en un boton
 * @return void
 */
public void saveStation(int buttonId, double station){
    if (isAM()){
        stationsAM.set(buttonId-1, station);
    }else{
        stationsFM.set(buttonId-1, station);
    }
}


/**Metodo para mostrar la estacion guardada en un boton
 * @return double
 * @param buttonID 
 */

public double selectStation(int buttonId){
    if (isAM()){
        return stationsAM.get(buttonId - 1);
    }else{
        return stationsFM.get(buttonId-1);
    }
    
}




}
