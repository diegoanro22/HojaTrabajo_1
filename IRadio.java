/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

public interface IRadio {
    void saveStation();
    boolean isAM();
    boolean isON();
    double selectStation();
    void switchOnOff();
    void switchAmFm();
    double nextStation();
}
