import javax.swing.JOptionPane;

public class Conversion_Num{
    public static void main(String args[]){
        int opc;
        String todobin="Decimal:    Binario:\n",todohexa="Decimal:    Hexadecimal:\n",todorom="Arabigo   Romano\n",todoara="Romano:   Arabigo:\n";
            
        do{
                opc=Integer.parseInt(JOptionPane.showInputDialog("Escoge la opción que deseeas convertir:\n"+"\n"+
                "1. Sistema Decimal a Sistema Binario\n2. Sistema Decimal a Sistema Hexadecimal\n"+
                "3. Numero Arábigo a Romano\n4. Numero Romano a Arabigo\n5. Mostrar datos y salir del programa\n6. Salir del Programa"));
            
                switch(opc){
                case 1:
                //Conversión de decimal a binario
                int dec,lon,a;
                String bin="",bin1="";
                dec=Integer.parseInt(JOptionPane.showInputDialog("Introducir el numero base decimal:"));
                a=dec;
                while(a !=0){
                    if (a%2==0){
                        bin+=0;
                    }else{
                        bin+=1;
                    }
                    a/=2;
                }
                lon=bin.length();
                for(int x=lon-1;x>=0;x--){
                    bin1=bin1+bin.charAt(x);
                }
                todobin+=dec+"            "+bin1+"\n";
                JOptionPane.showMessageDialog(null, "Decimal   Binario\n"+dec+"          "+bin1);
                break;
                
                case 2:
                //Conversión de decimal a Hexadecimal
                int nume;
                String hexa;
        
                nume=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero:"));
                hexa=Integer.toHexString(nume);
                todohexa+=nume+"            "+hexa+"\n";  
                JOptionPane.showMessageDialog(null, "Deciaml   Hexadecimal\n"+nume+"          "+hexa);
                break;
                
                case 3:
                //Conversión Numero Arábigo a Romano
                int ara,u,d,c,m;
                String un="",de="",ce="",mi="";
                ara=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu numero arabigo:"));
                
                m=ara/1000;
                c=(ara%1000)/100;
                d=((ara%1000)%100)/10;
                u=u=(((ara%1000)%100)%10);
                
                switch(m){
                    case 1:
                    mi+="M";
                    break;
                    case 2:
                    mi+="MM";
                    break;
                    case 3:
                    mi+="MMM";
                    break;
                }
                switch(c){
                    case 1:
                    ce+="C";
                    break;
                    case 2:
                    ce+="CC";
                    break;
                    case 3:
                    ce+="CCC";
                    break;
                    case 4:
                    ce+="CD";
                    break;
                    case 5:
                    ce+="D";
                    break;
                    case 6:
                    ce+="DC";
                    break;
                    case 7:
                    ce+="DCC";
                    break;
                    case 8:
                    ce+="DCCC";
                    break;
                    case 9:
                    ce+="CM";
                    break;
                }
                switch(d){
                    case 1:
                    de+="X";
                    break;
                    case 2:
                    de+="XX";
                    break;
                    case 3:
                    de+="XX";
                    break;
                    case 4:
                    de+="XL";
                    break;
                    case 5:
                    de+="L";
                    break;
                    case 6:
                    de+="LX";
                    break;
                    case 7:
                    de+="LXX";
                    break;
                    case 8:
                    de+="LXXX";
                    break;
                    case 9:
                    de+="XC";
                    break;
                }
                switch(u){
                    case 1:
                    un+="I";
                    break;
                    case 2:
                    un+="II";
                    break;
                    case 3:
                    un+="III";
                    break;
                    case 4:
                    un+="IV";
                    break;
                    case 5:
                    un+="V";
                    break;
                    case 6:
                    un+="VI";
                    break;
                    case 7:
                    un+="VII";
                    break;
                    case 8:
                    un+="VIII";
                    break;
                    case 9:
                    un+="IX";
                    break;
                }
                String romano=mi+ce+de+un;
                
                todorom+=ara+"          "+romano+"\n";
                JOptionPane.showMessageDialog(null,"Arabigo: "+ara+"  Romano: "+romano);
                
                break;
                
                case 4:
                //Conversión Numero Romano a Arabigo
                String rom=JOptionPane.showInputDialog("Ingresa el numero Romano").toUpperCase();
                int num=0;
        
                if(rom.contains("MMM")){
                    num+=3000;
                }else if(rom.contains("MM")){
                    num+=2000;
                }else if(rom.contains("M")){
                    num+=1000;
                }
                   
                if(rom.contains("CM")){
                    num+=900;
                }else if(rom.contains("DCCC")){
                    num+=800;
                }else if(rom.contains("DCC")){
                    num+=700;
                }else if(rom.contains("DC")){
                    num+=600;
                }else if(rom.contains("D")){
                    num+=500;
                }else if(rom.contains("CD")){
                    num+=400;
                }else if(rom.contains("CCC")){
                    num+=300;
                }else if(rom.contains("CC")){
                    num+=200;
                }else if(rom.contains("C")){
                    num+=100;
                }
                                    
                  if(rom.contains("XC")){
                   num+=90;
                  }else if(rom.contains("LXXX")){
                   num+=80;
                  }else if(rom.contains("LXX")){
                   num+=70;
                  }else if(rom.contains("LX")){
                      num+=60;
                  }else if(rom.contains("L")){
                        num+=50;
                  }else if(rom.contains("XL")){
                           num+=40;
                  }else if(rom.contains("XXX")){
                           num+=30;
                  }else if(rom.contains("XX")){
                           num+=20;
                  }else if(rom.contains("X")){
                           num+=10;
                   }
         
                 if(rom.contains("IX")){
                   num+=9;
                  }else if(rom.contains("VIII")){
                     num+=8;
                  }else if(rom.contains("VII")){
                     num+=7; 
                  }else if(rom.contains("VI")){
                    num+=6;
                  }else if(rom.contains("V")){
                    num+=5;
                  }else if(rom.contains("IV")){
                    num+=4;
                  }else if(rom.contains("III")){
                    num+=3;
                  }else if(rom.contains("II")){
                    num+=2;
                  }else if(rom.contains("I")){
                    num+=1;
                 }                
        
                todoara+=rom+"      "+num+"\n";
                JOptionPane.showMessageDialog(null, "Romano: "+rom+"    "+"Arabigo: "+num);
                
                break;
                
                case 5:
                JOptionPane.showMessageDialog(null,"Datos totales:\n"+"\n"+todobin+"\n"+todohexa+"\n"+todorom+"\n"+todoara);
                opc=6;
                break;
                
                case 6:
                break;
                
                default:
                JOptionPane.showMessageDialog(null,"La opcion no esta en el menu");
                
            }
        
        }while(opc !=6);
    }
}
