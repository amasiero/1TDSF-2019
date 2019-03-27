import br.com.fiap.venda.josefina.bo.Produto;
import br.com.fiap.venda.josefina.bo.Venda;

public class Programa {

	public static void main(String[] args) {
		
		Produto p = new Produto("Tapioca", 1, "kg", 4.5);
		
		Venda v = new Venda("Marisa Monte", p, "Arnaldo Antunes");
		
		System.out.println(v.getVendedor() + " vendeu " + 
				v.getProduto().getQuantidade() + 
				" " + v.getProduto().getUnidade() +
				" de " + v.getProduto().getDescricao() +
				" por R$ " + v.getProduto().getValor() + 
				" para " + v.getCliente()
				);

	}

}
