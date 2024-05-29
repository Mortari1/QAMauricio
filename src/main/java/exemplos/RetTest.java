package exemplos;

import org.junit.jupiter.api.Test;

import junit.framework.*;
public class RetTest {
	
	@Test
	public void testaAdicao() {
		double result;
		Ret conta = new Ret();
		
		result = conta.adicao(10.50, 10.50);
		
		Assert.assertEquals(22, result, 0);
	}
}
