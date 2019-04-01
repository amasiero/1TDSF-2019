package br.com.fiap.nac.exercicio01;

public class TesteRestaurante {

	public static void main(String[] args) {
		Pedido p = new Pedido("Anakin", "Moqueca de Jaca", 40.0);
		p.setPedidoPendente(false);
		System.out.println(p.getCliente() + " pediu " + p.getUltimoPedido() 
				+ " no valor de R$ " + p.getValorTotal() 
				+ "\nO pedido estah pendente? " + p.isPedidoPendente());
	}
	
}
