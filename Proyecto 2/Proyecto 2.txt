package tokenizer;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

class Tokenizer {
    
    public static boolean isNumero(String numero){
        double num;
         try{
             num = Double.parseDouble(numero);
         }
         catch(Exception e){
             return(false);
         }
             return(true);
    }
    
    public static boolean isOperador(String operador,String[] operadores){
        for(int i=0;i<4;i++){
            if(operadores[i].equals(operador)){
                return true;
            }
        }      
        return false;     
    }  
    public static boolean isPuntuacion(String punt,String[] signosDePuntuacion){
        for(int i=0;i<7;i++){
            if(signosDePuntuacion[i].equals(punt)){
                return true;
            }
        }       
        return false;
    }
    
    public static void leer(String ruta){
        try{
        File archivo = new File(ruta);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);       
        String linea;
        String token;
        ArrayList<String> ar = new ArrayList<>();       
        while((linea=br.readLine())!=null){           
            StringTokenizer st = new StringTokenizer(linea, ";/./,/(/)/[/]/:", true);
            while(st.hasMoreTokens()){              
                token = st.nextToken();
                ar.add(token);
                System.out.println(ar.get(0));
            }
        }       
        }
        catch(Exception e){           
        }
    }

    public static void main(String[] args){
       String[] operadores = {"+","-","*","/"};
       String[] palabrasReservadas = {"if","while","public","for","private","main","int","float",
                                        "double","String"};
       String[] signosDePuntuacion = {";",".",",","(",")","[","]"};
       String[][] Identificadores = {{"01","operador"},
                                    {"02","p_reservada"},
                                    {"03","numero"},
                                    {"04","espacio en blanco"},
                                    {"05","identificador"},
                                    {"06","puntuacion"}};                                  
       leer("C:\\Users\\Julio\\Desktop\\AutomatasII.txt");
       isPuntuacion("",signosDePuntuacion);
       isOperador("",operadores);
       isNumero("");
    }
}