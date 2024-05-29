package exemplos;



import junit.framework.Assert;
public class RetTest {
	
	@org.junit.Test
	public void testaAdicao() {
		double result;
		Ret conta = new Ret();
		
		result = conta.adicao(10.50, 10.50);
		
		Assert.assertEquals(22, result, 0);
	}
}
