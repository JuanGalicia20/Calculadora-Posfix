/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author juana
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
    				System.out.println("INSTRUCCIONES---------------------------------\n");
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
