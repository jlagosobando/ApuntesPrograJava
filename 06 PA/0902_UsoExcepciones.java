import java.util.Scanner;

public class UsoExcepciones {
    public static Scanner teclado = new Scanner(System.in);

    public static double suma(double num1, double num2) {
        double aux;
        aux = num1 + num2;
        return aux;
    }

    public static double resta(double num1, double num2) {
        double aux;
        aux = num1 - num2;
        return aux;
    }

    public static double mult(double num1, double num2) {
        double aux;
        aux = num1 * num2;
        return aux;
    }

    public static double div(double num1, double num2) {
        double aux;
        if(num2 != 0){
            aux = num1 / num2;}
        else{
            throw new ArithmeticException("El calc. no es realizable ya que el divisor es 0");
        }
        return aux;
    }

    public static double div(double num1) {
        double aux;
        double num2=teclado.nextDouble();
        if(num2 != 0){
            aux = num1 / num2;}
        else{
            throw new ArithmeticException("El calc. no es realizable ya que el divisor es 0");
        }
        return aux;
    }



    public static void main(String args[]){

        double a=1,b=1;

        System.out.println("Ingrese 2 numeros");
            a = teclado.nextDouble();
            b = teclado.nextDouble();

        System.out.println(suma(a,b));
        System.out.println(resta(a,b));
        System.out.println(mult(a,b));


        try{
            System.out.println(div(a,b));}
        catch (ArithmeticException e) {
            System.out.println("Ocurrió un error al dividir por 0");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error, lo atrapamos con el comodín");
        }
        finally
            {System.out.println("Yo trabajo igual");}


        System.out.println("Aquí aparece nuestro 2do div>>");
        try{
            System.out.println(div(a));}
        catch (ArithmeticException e) {
            System.out.println("Ocurrió un error al dividir por 0");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error, lo atrapamos con el comodín");
        }
        finally
        {System.out.println("Yo trabajo igual");}


    }
}



