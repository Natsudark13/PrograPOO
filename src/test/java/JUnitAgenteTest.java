

import static org.junit.Assert.*;
import org.junit.Test;
import com.poo.bieninmueble.logicaDeNegocios.Agente;

public class JUnitAgenteTest {
	
		@Test
		public void setUp() {
			
			Agente m1 = new Agente("1234", "Agente" , "Apellido", "correo@gmail.com", "2272323232", null);
			
			// Objetos iguales
			assertEquals(m1.getApellido(),"Apellido");
			assertEquals(m1.getCorreo(),"correo@gmail.com");
			
			// Verdadero
			//assertTrue(m1.i1>m1.i2);
			
			//Falso
			//assertFalse(m1.i2>m1.i1);
			
			//Not null
			assertNotNull(m1.getIdentificacion());
			
			//Null
			assertNull(m1.getContrasenna());
			
			
			assertSame(m1.getIdentificacion(),"1234");
			
			//Not same
			//assertNotSame(m1.s1,m1.s5);
			
			//
			//assertArrayEquals(m1.a1,a1);
		}

}
