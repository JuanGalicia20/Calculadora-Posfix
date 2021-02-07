package calculadoraposfix;

import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Juan Andres Galicia Reyes 20298 UVG 2021
 * @version 06/02/21
 */
public class CalculadoraPosfix {

	private static JFileChooser file = new JFileChooser();
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner leer = new Scanner(System.in);
    	File arch;
    	String ruta = null;
    	
    	
    	boolean bol = true;
    	while(bol)
    	{
    		System.out.println("Bienvenido a la calculadora en formato posfix\nSeleccione una opcion\n"
            		+ "1. Leer instrucciones\n"
            		+ "2. Abrir archivo de texto\n"
            		+ "3. Calcular resultado del archivo\n"
            		+ "4. Salir");
    		String op1 = leer.next();
    		switch(op1)
    		{
    			case "1":
    				System.out.println("-------------------INSTRUCCIONES---------------------------------\n"
    						+ "Esta es una calculadora de operaciones basicas entre 2 digitos"
    						+ "\nPara esto se requiere seleccionar un archivo de texto que contenga los digitos"
    						+ " y operaciones en formato posfix. Es decir ambos digitos primero y luego la operacion"
    						+ "\nPor ejemplo: 5 2 + es una suma de 5 + 2 ");
    				break;
    				
    				
    			case "2":
    				int r = file.showOpenDialog(null);
                    
                    if (r == JFileChooser.APPROVE_OPTION) {
                        arch = file.getSelectedFile();
                        ruta = arch.getAbsolutePath();
                        System.out.println("\nArchivo a utilizar: " + arch.getAbsolutePath());
                    }
    				break;
    				
    				
    			case "3":
    				CalculadoraCod calc = new CalculadoraCod();
    				String calculo = calc.decode(ruta);
    				System.out.println("\n\n"+calculo);
    				break;
    				
    				
    			case "4":
    				break;
    			default:
    				System.out.println("Ingrese un valor valido");
    				break;
    		}
        }
    }
}
