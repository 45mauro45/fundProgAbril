import java.util.Scanner;

import javax.sound.midi.SysexMessage;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("un programa que permita leer una serie de numeros");
        Scanner Datos = new Scanner(System.in);
        int Nro;
        int CantidaNrosPares = 0, CantidadNrosImpares = 0, CantCero = 0;
        Boolean informaCERO = false;
        Boolean parActual, parAnterior = false, informaPA;
        System.out.println("ingrese un número[ -1 = cerrar]"); //2
        Nro = Datos.nextInt();

        while (Nro >= 0) {

       // System.out.println("ingrese un número[ -1 = cerrar]");
       // Nro = Datos.nextInt();
        parActual =  Nro%2 == 0;

        if (parActual) {
          CantidaNrosPares = CantidaNrosPares + 1;
            
        } else {
            CantidadNrosImpares++;
        }
        
        if (Nro == 0){
        informaCERO = true;
        CantCero++;
        }
        
        if (parActual == parAnterior){
            informaPA = true;
        }
        parAnterior = parActual;
        System.out.println("ingrese un número[ -1 = cerrar]");
        Nro = Datos.nextInt();
       

        }

        System.out.println("n/t-----informe de números encontrados----");

        System.out.println("cantidad de números pares " + CantidaNrosPares);

        System.out.println("cantidad de números impares " + CantidadNrosImpares);

        if (informaCERO) {
            System.out.println("se encontro un cero dentro de la serie ingresada");

            System.out.println("cantidad de ceros encontrados: " + CantCero);
            
        } else {

            System.out.println(" No se encontro ningun cero dentro de la serie ingresada");

        }

        if (informaPA = false) {
            System.out.println("la serie ingresada tiene números pares con alternancia ");
        } else {
            
            System.out.println("la serie ingresada tiene números pares sin alternancia ");
        }
    

    }
}
