import java.util.Scanner;

//string
public class Cadenas {
    public static void main(String[] args){
        int i;
        String palabra="arbol";
        boolean esCapicua=true;
        
        for(i=0;i<palabra.length();i++){
                                //palabra[i]
            System.out.println(palabra.charAt(i));
        
        }
        
        for(i=0;i<(palabra.length() / 2) ;i++){
            if(palabra.charAt(i) != palabra.charAt(palabra.length()-1-i))
                esCapicua=false;
                break;
        }
        System.out.println(esCapicua);
        
        
        
        
        
        
    }
}

  
