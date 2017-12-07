package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class CalculadoraTest {
  private Calculadora cal;
 
  @Before
  public void Before() {
	  cal = new Calculadora();
  }
  
  @After
  public void After() {
	  cal.seth(0);
  }
  @Test
  public void cuadradoTest() {
	  cal.seth(3);
	  int esperado = cal.cuadrado();
	  int actual=9;
	  assertEquals(esperado,actual);
  }
  
}
