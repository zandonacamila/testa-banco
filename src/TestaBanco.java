
public class TestaBanco {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta(1234, 5689);
		Conta contaDaCamila = new Conta(4578, 5689);
				
		contaDaCamila.deposita(500);
		System.out.println(contaDaCamila.getSaldo());
		contaDaCamila.saca(100);
		System.out.println(contaDaCamila.getSaldo());
		contaDaCamila.transfere(100, contaDoPaulo);
		System.out.println(contaDoPaulo.getSaldo());
		System.out.println(contaDaCamila.getSaldo());
		System.out.println(Conta.getTotal());
	}
}
