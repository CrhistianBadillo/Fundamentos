import javax.swing.JOptionPane;
public class CicloMientras{
    public static void main (String args[]){
        int x;
        String nomb="";
        
        x=Integer.parseInt(JOptionPane.showInputDialog("¿Hay alumnos?\nElige el numero correspondiente:\n1.Si    2.No"));
        
        while (x==1){
            String alumno=JOptionPane.showInputDialog("Dame el nombre del alumno:");
            
            x=Integer.parseInt(JOptionPane.showInputDialog("¿Todavia hay alumnos?\nElige el numero correspondiente:\n1.Si    2.No"));
            nomb +=alumno+", ";
        }
        
        JOptionPane.showMessageDialog(null, "Los nombres de los alumnos son: \n"+ nomb+" ");
    }
}
