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
        Radio Radio = new Radio();
        int opcion = 1;


        while (opcion == 1) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Radio");
            System.out.println("1. Encender radio");
            System.out.println("2. Cambiar estación AM/FM");
            System.out.println("3. Avanzar de emisora");
            System.out.println("4. Guardar emisora");
            System.out.println("5. Reproducir emisora guardada");
            System.out.println("6. Apagar radio");
            System.out.println("-----------------------------------------------------------");
            int menuInicial = teclado.nextInt();
            teclado.nextLine();

            switch (menuInicial) {
                case 1:
                    if (!Radio.isOn()) {
                        Radio.switchOnOff();
                        System.out.println("Radio encendido");
                    } else {
                        System.out.println("El radio ya está encendido");
                    }
                    break;

                case 2:
                    if (!Radio.isOn()) {
                        System.out.println("Radio apagado");
                        System.exit(0);}
                    else {
                        Radio.switchAMFM();
                        if (Radio.isAM()) {
                            System.out.println("Cambiado a Estación AM");
                        } else {
                            System.out.println("Cambiado a Estación FM");
                        }
                    }
                        break;
                    
                case 3:
                    if (!Radio.isOn()) {
                        System.out.println("Radio apagado");
                        System.exit(0);}
                    else {
                        System.out.println(String.format("%.1f", Radio.nextStation()));
                    }
                        break;

                case 4:
                    if (!Radio.isOn()) {
                        System.out.println("Radio apagado");
                        System.exit(0);}
                    else {
                        System.out.println("Ingrese número de boton a guardar: ");
                        if (Radio.isAM()){
                            int buttonId= Integer.parseInt(teclado.nextLine());
                            if (buttonId>0 && buttonId<=12){
                                Radio.saveStation(buttonId, Radio.getStationAM());
                            }else{
                                System.out.println("Número de botón no válido");
                            }
                        }else{
                            int buttonId= Integer.parseInt(teclado.nextLine());
                            if (buttonId>0 && buttonId<=12){
                                Radio.saveStation(buttonId, Radio.getStationFM());
                            }else{
                                System.out.println("Número de botón no válido ");
                            }
                        }
                    }
                    break;

                case 5:
                if (!Radio.isOn()) {
                    System.out.println("Radio apagado");
                    System.exit(0);}
                else{
                    System.out.println("Ingrese número de boton: ");
                    int buttonId= Integer.parseInt(teclado.nextLine());
                    if (buttonId>0 && buttonId<=12){
                        System.out.println(String.format("%.1f",Radio.selectStation(buttonId)));
                    }else{
                        System.out.println("Botón no válido");
                    }
                }
                break;


                case 6: 
                    if (Radio.isOn()) {
                        Radio.switchOnOff();
                        System.out.println("Radio apagado");
                        System.exit(0);
                    } else {
                        System.out.println("El radio ya está apagado");
                        opcion = 2;
                    }
                    break;
                
                    default:
                    System.out.println("La opcion no es valida");
                    opcion = 2;
                    break;
            }            
        }
        }
}
