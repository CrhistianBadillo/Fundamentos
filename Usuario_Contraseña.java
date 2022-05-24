import javax.swing.JOptionPane;

public class Usuario_Contraseña{
    public static void main(String args[]){
        String usuario="",contraseña;
        int cont=0,inte=3;
        
        usuario=JOptionPane.showInputDialog("Usuario");
        JOptionPane.showMessageDialog(null, "Bienvenido "+usuario);
        JOptionPane.showMessageDialog(null, "Tienes "+inte+" intentos para ingresar los 4 digitos de la contraseña");  
        //La contaseña es 1234
        while(inte>0 ){ 
        contraseña=JOptionPane.showInputDialog("Introduce la contraseña");
        cont=Integer.parseInt(contraseña);
        if (cont!=1234){
	 inte=inte-1;
         JOptionPane.showMessageDialog(null, "Acceso Denegado"+"\n"+"Te quedan "+inte+" intentos");
        }
        else if (inte==0){
            JOptionPane.showMessageDialog(null, "Acceso Total Denegado");
            
        }
        else if (cont==1234){
         
            JOptionPane.showMessageDialog(null, "Acceso Correcto");   
            inte=0;
        }
        }
     
     
        
    }
}