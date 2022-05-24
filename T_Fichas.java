import javax.swing.JOptionPane;
import java.util.Random;

public class T_Fichas{
    public static void main(String args[]){
         Random r=new Random();
        
          int opc,sis=0,inf=0,tic=0,ges=0,arq=0,ts=0,fs=0;
          int ti=0,fi=0,tt=0,ft=0,tg=0,fg=0,ta=0,fa=0;
        
          do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("Selecciona tu carrera:\n"+""+"\n"+"1. Ing. en Sistemas\n"+
            "2. Ing. en  Informatica\n3. Ing. en  TIC's\n4. Ing. en  Gestion\n5. Ing. en  Arquitectura\n6. Concentrado y Salir"));
            
             switch(opc){
                 case 1:
                        do{
                        if(sis>6){
                            JOptionPane.showMessageDialog(null,"Ya no hay fichas disponibles para está carrera");
                            break;
                        }
                        int ficha=r.nextInt(45),dia=r.nextInt(30),mes=r.nextInt(13),salon=r.nextInt(21);
                        String nom=JOptionPane.showInputDialog("Ingresa tu nombre");
                        sis+=1;
                        ts+=3500;
                        fs=6-sis;
                        JOptionPane.showMessageDialog(null,"No. Ficha: "+ficha+"\nNombre: "+nom+"\nCarrera: Sistemas Computacionales"+
                        "\n"+"Costo ficha: $3500"+"\n"+"Fecha: "+dia+"/"+mes+"/2018"+"\n"+"Salon: S"+salon+"\n"+"Hora: 9am");
                        break;
                    }while(sis<=6);
                 break;
                 case 2:
                    do{
                        if(inf>10){
                            JOptionPane.showMessageDialog(null,"Ya no hay fichas disponibles para está carrera");
                            break;
                        }
                        int ficha=r.nextInt(45),dia=r.nextInt(30),mes=r.nextInt(13),salon=r.nextInt(21);
                        String nom=JOptionPane.showInputDialog("Ingresa tu nombre");
                        inf+=1;
                        ti+=3500;
                        fi=10-inf;
                        JOptionPane.showMessageDialog(null,"No. Ficha: "+ficha+"\nNombre: "+nom+"\nCarrera: Informatica"+
                        "\n"+"Costo ficha: $3500"+"\n"+"Fecha: "+dia+"/"+mes+"/2018"+"\n"+"Salon: S"+salon+"\n"+"Hora: 9am");
                        break;
                    }while(inf<=10);
                 break;
                 case 3:
                    do{
                        if(tic>8){
                            JOptionPane.showMessageDialog(null,"Ya no hay fichas disponibles para está carrera");
                            break;
                        }
                        int ficha=r.nextInt(45),dia=r.nextInt(30),mes=r.nextInt(13),salon=r.nextInt(21);
                        String nom=JOptionPane.showInputDialog("Ingresa tu nombre");
                        tic+=1;
                        tt+=3500;
                        ft=8-tic;
                        JOptionPane.showMessageDialog(null,"No. Ficha: "+ficha+"\nNombre: "+nom+"\nCarrera: TIC's"+
                        "\n"+"Costo ficha: $3500"+"\n"+"Fecha: "+dia+"/"+mes+"/2018"+"\n"+"Salon: S"+salon+"\n"+"Hora: 9am");
                        break;
                    }while(tic<=8);
                 break;
                 case 4:
                    do{
                        if(ges>10){
                            JOptionPane.showMessageDialog(null,"Ya no hay fichas disponibles para está carrera");
                            break;
                        }
                        int ficha=r.nextInt(45),dia=r.nextInt(30),mes=r.nextInt(13),salon=r.nextInt(21);
                        String nom=JOptionPane.showInputDialog("Ingresa tu nombre");
                        ges+=1;
                        tg+=3500;
                        fg=10-ges;
                        JOptionPane.showMessageDialog(null,"No. Ficha: "+ficha+"\nNombre: "+nom+"\nCarrera: Gestión Empresarial"+
                        "\n"+"Costo ficha: $3500"+"\n"+"Fecha: "+dia+"/"+mes+"/2018"+"\n"+"Salon: S"+salon+"\n"+"Hora: 9am");
                        break;
                    }while(ges<=10);
                 break;
                 case 5:
                    do{
                        if(arq>10){
                            JOptionPane.showMessageDialog(null,"Ya no hay fichas disponibles para está carrera");
                            break;
                        }
                        int ficha=r.nextInt(45),dia=r.nextInt(30),mes=r.nextInt(13),salon=r.nextInt(21);
                        String nom=JOptionPane.showInputDialog("Ingresa tu nombre");
                        arq+=1;
                        ta+=3500;
                        fa=10-arq;
                        JOptionPane.showMessageDialog(null,"No. Ficha: "+ficha+"\nNombre: "+nom+"\nCarrera: Arquitectura"+
                        "\n"+"Costo ficha: $3500"+"\n"+"Fecha: "+dia+"/"+mes+"/2018"+"\n"+"Salon: S"+salon+"\n"+"Hora: 9am");
                        break;
                    }while(arq<=10);
                 break;
                 case 6:
                 int toden=sis+inf+tic+ges+arq;
                 int totso=44-(sis+inf+tic+ges+arq);
                 int todm=ts+ti+tt+tg+ta;
                 JOptionPane.showMessageDialog(null,"La carrera de Ing. en Sistemas entrego "+sis+" fichas"+", le sobraron "+fs+", recaudando un total de $"
                 +ts+"\n"+"La carrera de Ing. en Informatica entrego "+inf+" fichas"+", le sobraron "+fi+", recaudando un total de $"+ti+"\n"+
                 "La carrera de Ing. en TIC's entrego "+tic+" fichas"+", le sobraron "+fs+", recaudando un total de $"+tt+"\n"+
                 "La carrera de Ing. en Gestion entrego "+ges+" fichas"+", le sobraron "+fg+", recaudando un total de $"+tg+"\n"+
                 "La carrera de Ing. en Arquitectura entrego "+arq+" fichas"+", le sobraron "+fa+", recaudando un total de $"+ta+"\n"+
                 "Total de fichas entregadas: "+toden+"\n"+
                 "Total de fichas sobrantes: "+totso+"\n"+
                 "Total de dinero: $"+todm);
                 opc=6;
                 
                 break;
                 default:
                 JOptionPane.showMessageDialog(null, "Seleccione una opción valida.");
             }
    
          }while(opc !=6);
    }
}