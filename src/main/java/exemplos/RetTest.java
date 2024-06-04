package exemplos;



import org.junit.Test;
import org.junit.Assert;

public class RetTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testaAdicao() {
		double result;
		Ret conta = new Ret();
		
		result = conta.adicao(10.50, 10.50);
		
		Assert.assertEquals(21, result, 0);
	}
}
