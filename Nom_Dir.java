import javax.swing.JOptionPane;

public class Nom_Dir{
    public static void main(String args[]){
        String nombre,direccion,datos="A continuacion se presentara el nombre y la direccion: "+"\n";
        
        for (int num=1; num<=5; num++){
            nombre=JOptionPane.showInputDialog("Introduce tu nombre");
            datos+="El nombre es "+nombre;
            direccion=JOptionPane.showInputDialog("Introduce tu direccion");
            datos+=" y la direccion es "+direccion+"\n";
            
            
        }
            
       JOptionPane.showMessageDialog(null, datos);
    }
}
