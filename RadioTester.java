/*Universidad del Valle de Guatemala 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class RadioTester {

    private Radio radio;

    @Before
    public void setUp() {
        radio = new Radio();
    }

    // Prueba 1: Verificar que el método saveStation guarda correctamente una estación
    @Test
    public void testSaveStation() {
        int buttonId = 1;
        double station = 600.0;

        radio.setAM(true);
        radio.saveStation(buttonId, station);

        assertEquals(station, radio.selectStation(buttonId), 0.0);
    }

    // Prueba 2: Verificar que nextStation hace que la estación vuelva al principio después de alcanzar el final    @Test
    @Test
    public void testNextStationWrapsAround() {
        int callsNeeded = (1610 - 530) / 10 + 1;  
        // Act
        for (int i = 0; i < callsNeeded; i++) {
            double previousStation = radio.nextStation();
        }

        // Assert
        assertEquals(530, radio.getStationAM(), 0.0);
        assertEquals(87.9, radio.getStationFM(), 0.0);
    }

    // Prueba 3: Verificar que al presionar un botón, se selecciona la estación guardada en ese botón
    @Test
    public void testSelectStationAfterSave() {
        int buttonId = 3;
        double station = 950.0;

        radio.setAM(true);
        radio.saveStation(buttonId, station);

        assertEquals(station, radio.selectStation(buttonId), 0.0);
    }
}
