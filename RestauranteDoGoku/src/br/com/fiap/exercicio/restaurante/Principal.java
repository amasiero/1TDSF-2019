package br.com.fiap.exercicio.restaurante;

public class Principal {

	public static void main(String[] args) {
		
		Pedido p = new Pedido("Batata Frita", 36.0);
		Mesa m = new Mesa("Minhoquinha", p);
		m.entregarPedido();
		// Vantagem de utilizar é que você utiliza a mesma declaração, porém você 
		// cria um novo endereço de memória e perde a referência do primeiro.
		// O primeiro será "limpo" pelo Garbage Collector.
		// p = new Pedido("Polenta Frita", 35.0);
		// m.registrarPedido(p);
		
		// Esse eh um jeito de utilizar o mesmo endereço de memória, só é necessário ficar
		// atento ao "reset" de maneira adequada de todas os atributos do objeto.
		// Dessa maneira, a chance de existir um erro é maior, pois os desenvolvedores
		// podem esquecer de reiniciar algum dos atributos.
//		p.setPedido("Polenta Frita");
//		p.setValor(35.0);
//		p.setPendente(true);
//		m.registrarPedido(p);
		
		// Cria um objeto diretamente no parâmetro do método.
		// É mais simples e evita problemas de declarações faltantes
		// e/ou esquecimento de algum dos atributos na hora de reiniciar.
		m.registrarPedido(new Pedido("Polenta Frita", 35.0));
		System.out.println(m.fecharConta());
		m.entregarPedido();
		System.out.println(m.fecharConta());
	}

}










