/*Universidad del Valle de Guatemala 
 *14 enero, 2024
 *Algoritmos y estructura de datos 
 *Genser Andree - 23401
 *Diego Rosales - 23258
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Radio miRadio = new Radio();


        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Radio");
            System.out.println("1. On/Off");
            System.out.println("2. Cambiar estación AM/FM");
            System.out.println("3. Avanzar de emisora");
            System.out.println("4. Guardar emisora");
            System.out.println("5. Reproducir emosora guardada");
            System.out.println("-----------------------------------------------------------");

            int menuInicial = teclado.nextInt();

            switch (menuInicial) {
                case 1:
                    miRadio.isOn();
                    miRadio.switchOnOff();
                    break;

                case 2:
                    if (!miRadio.isOn()) {
                        System.exit(0);}
                    
                    else {
                        miRadio.isAM();
                        miRadio.switchAMFM();
                        break;}
                default:
                    break;
            }


            
        }

        }
    }
