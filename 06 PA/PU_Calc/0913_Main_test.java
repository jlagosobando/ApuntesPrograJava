import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Main_test {

    @Test
    public void suma_test(){
        double suma_control, suma_obtenida;

        suma_control=13;
        suma_obtenida=Main.suma(10,3);

        Assertions.assertEquals(suma_control,suma_obtenida);

    }

    @Test
    public void resta_test(){
        double resta_control, resta_obtenida;

        resta_control=3;
        resta_obtenida=Main.resta(8,5);

        Assertions.assertEquals(resta_control,resta_obtenida);

    }

    @Test
    public void mult_test(){
        double mult_control, mult_obtenida;

        mult_control=25;
        mult_obtenida=Main.mult(5,5);

        Assertions.assertEquals(mult_control,mult_obtenida);
    }


    @Test
    public void div_test_int(){
        double div_control, div_obtenida;
        div_control=4;
        div_obtenida=Main.div(8,2);

        Assertions.assertEquals(div_control,div_obtenida);
    }
    @Test
    public void div_test_decimal(){
        double div_control, div_obtenida;
        div_control=2.5;
        div_obtenida=Main.div(5,2);

        Assertions.assertEquals(div_control,div_obtenida);


    }


    @Test
    public void div_test_infinitesimal(){
        double div_control, div_obtenida;
        div_control=1.290322;
        div_obtenida=Main.div(4,3.1);

        Assertions.assertEquals(div_control, div_obtenida,0.000001);
    }

    @Test
    public void div_test_operiod(){
        double div_control, div_obtenida, ope_inf;
        ope_inf=4.0/3.0;
        div_control=3.75;
        div_obtenida=Main.div(5,ope_inf);

        Assertions.assertEquals(div_control, div_obtenida,0.000001);
    }



    @Test
    public void div_test_zerodiv(){
        double div_obtenida;
        String control = "El calc. no es realizable ya que el divisor es 0";

        try{
        div_obtenida=Main.div(4,0);}
        catch(ArithmeticException e){
            Assertions.assertEquals(control,e.getMessage());
        }


    }


}
// cambio