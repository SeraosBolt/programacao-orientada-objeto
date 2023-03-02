/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package braintech.matheussoares;
import java.util.Scanner;
/**
 *
 * @author aluno
 */

public class MatheusSoares {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a Base: ");
        String inpBase = scan.nextLine();
        System.out.println("Digite a Altura: ");
        String inpAltura = scan.nextLine();
        double altura = Double.parseDouble(inpAltura);
        double base = Double.parseDouble(inpBase);
        
        double areaTri = (base*altura)/2;
        
        
        
       System.out.println("Area Trianagulo: " + areaTri);
    }
}
