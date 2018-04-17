/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodolfo1fernandez1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import javax.swing.JOptionPane;

/**
 *Nombre de la clase:Vectores
 * Author:Rodolfo Alexis Fernandez Castro
 * version:1.0
 * Copyrigth:Itca-Fepade
 * fecha:17/04/2018
 * 
 */
public class Rodolfo1Fernandez1 {

    public static void main(String[] args) {
     
      
           
            int w=0;
            int cont=0;
             Numberformat formato=new format("$#,###.00");
           
                   
                   
                   
                   w=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cuantos empleados ingresara"));
                    String nombre[]=new String[w];
                    double salarioh[]=new double[w];
                    int horas[]=new int[w];
                    double salario[]=new double[w];
                    double renta[]=new double[w];
                    
           for (int i=0;i<nombre.length;i++) {
               nombre[i]=JOptionPane.showInputDialog(null,"Nombre del Empleado n°:"+(i+1));
               salarioh[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el salario por hora del Empleado n°"+(i+1)));
               horas[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de horas trabajadas del empleado n°"+(i+1)));
               
               renta[i]=(salarioh[i]*horas[i])*0.10;
               salario[i]=(salarioh[i]*horas[i])-renta[i];
           }
                   
                  
                   
                   for(int i=0;i<w;i++){
                       
                       if(salario[i]>=800){
                           cont++;
                       }
                       
                       
                       
                       JOptionPane.showMessageDialog(null,"Datos del empleado n°"+(i+1)+"\n"+nombre[i]+" y su respectivo salario es: "+salario[i]);
                   }
                    JOptionPane.showMessageDialog(null,"Salarios mayores a los $800: "+cont);
                   
                   
                   
                   
                   
                
           
        
    }
    
}
