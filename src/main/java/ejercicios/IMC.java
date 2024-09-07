
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        // TODO: Coloca aquí el código del ejercicio 8: Índice de masa corporal
        double imc = peso / (estatura * estatura);
        
       String Riesgo;
        if (edad < 45) {
            if (imc < 22.0) {
                Riesgo = "bajo";
            } else {
               Riesgo = "medio";
            }
        } else {
            if (imc < 22.0) {
              Riesgo = "medio";
            } else {
              Riesgo = "alto";
            }
        }
        
        
        String respuesta = String.format(Riesgo);
        return respuesta;
     
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
