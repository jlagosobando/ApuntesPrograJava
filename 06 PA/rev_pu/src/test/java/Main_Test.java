import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.*;

public class Main_Test {

    @Test
    public void suma_test()
    { double suma_control, suma_obtenida;

        suma_control=11;
        suma_obtenida=suma(8,3);

        Assertions.assertEquals(suma_control, suma_obtenida);
    }

    @Test
    public void resta_test()
    { double resta_control, resta_obtenida;

        resta_control=5;
        resta_obtenida=resta(8,3);

        Assertions.assertEquals(resta_control, resta_obtenida);
    }

    @Test
    public void mult_test(){
        double mult_control,mult_obtenida;

        mult_control=24;
        mult_obtenida=mult(8,3);

        Assertions.assertEquals(mult_control,mult_obtenida);
    }

    @Test
    public void div_test_int(){
        double div_control, div_obtenida;
        div_control=2;
        div_obtenida=div(4,2);

        Assertions.assertEquals(div_control,div_obtenida);

    }

    @Test
    public void div_test_double(){
        double div_control, div_obtenida;
        div_control=2.5;
        div_obtenida=div(5,2);

        Assertions.assertEquals(div_control,div_obtenida);
    }



    @Test
    public void div_test_infinitesimal()
    {
        double div_control, div_obtenida;
        div_control=1.290322;
        div_obtenida=div(4,3.1);

        Assertions.assertEquals(div_control,div_obtenida,0.000001);

    }

    @Test
    public void div_test_operiod()
    {
        double div_control, div_obtenida, ope_inf;
        ope_inf=4.0/3.0;
        div_control=3.75;
        div_obtenida=div(5,ope_inf);

        Assertions.assertEquals(div_control,div_obtenida,0.000001);

    }

    @Test
    public void div_test_zerodiv()
    {
        double div_obtenida;
        String control = "El calc. no es realizable ya que el divisor es 0";

        try
        {div_obtenida=div(4,0);}
        catch (ArithmeticException e)
        {Assertions.assertEquals(control,e.getMessage());}

    }
}
