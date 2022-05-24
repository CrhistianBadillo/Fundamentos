import javax.swing.JOptionPane;
import java.util.Random;

public class Examen{
    public static void main(String args[]){
        Random r=new Random();
        
        String concen="Municipio"+"          "+"9:00"+"          "+"12:00"
        +"          "+"15:00"+"          "+"18:00"+"          "+"Promedio"+"\n";
        int tempH1=0,tempH2=0,tempH3=0,tempH4=0;
        int tempHT1=0,tempHT2=0,tempHT3=0,tempHT4=0;
        
        String Municipios[]= {"Vicente Guerrero","Guadalupe Victoria","                  Durango","                  Santiago","      Gomez Palacio"};
        String Temperatura[]= {"9:00","12:00","15:00","18:00"};
        int Temperatura1[]=new int[5];
        int Temperatura2[]=new int[5];
        int Temperatura3[]=new int[5];
        int Temperatura4[]=new int[5];
        int ToTemp[]=new int[5];
        int TemProm[]=new int[5];
        
        
        for(int x=0;x<5;x++){
            Temperatura1[x]=r.nextInt(46);
            Temperatura2[x]=r.nextInt(46);
            Temperatura3[x]=r.nextInt(46);
            Temperatura4[x]=r.nextInt(46);
            ToTemp[x]=Temperatura1[x]+Temperatura2[x]+Temperatura3[x]+Temperatura4[x];
            TemProm[x]=ToTemp[x]/4;
            tempHT1+=Temperatura1[x];
            tempHT2+=Temperatura2[x];
            tempHT3+=Temperatura3[x];
            tempHT4+=Temperatura4[x];
            
            tempH1=(tempHT1)/5;
            tempH2=(tempHT2)/5;
            tempH3=(tempHT3)/5;
            tempH4=(tempHT4)/5;
            
            concen+=Municipios[x]+"          "+Temperatura1[x]+"°C          "+Temperatura2[x]+
            "°C          "+Temperatura3[x]+"°C          "+Temperatura4[x]+"°C          "+TemProm[x]+
            "°C                "+"\n";
            
        }
        
        JOptionPane.showMessageDialog(null, concen+"\n"+"El promedio de las 9:00 es "+tempH1+"°C"+"\n"+"El promedio de las 12:00 es "+tempH2+"°C"+
        "\n"+"El promedio de las 15:00 es "+tempH3+"°C"+"\n"+"El promedio de las 18:00 es "+tempH4+"°C");
        
        
    }
}
