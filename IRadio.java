/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

public interface IRadio {
    void saveStation(int buttonId, double statio);
    boolean isAM();
    boolean isOn();
    double selectStation(int buttonId);
    void switchOnOff();
    void switchAMFM();
    double nextStation();
}
