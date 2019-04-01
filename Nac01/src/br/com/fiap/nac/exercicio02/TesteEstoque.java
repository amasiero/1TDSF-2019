package br.com.fiap.nac.exercicio02;

public class TesteEstoque {
	
	public static void main(String[] args) {
		Produto p = new Produto("Lightsaber", 5, 1, 10, 2400.0);
		Venda v = new Venda(p, 2, 4800.0);
		System.out.println("Existem " + v.getProduto().getQuantidadeAtual() + " " + 
				v.getProduto().getDescricao() + " com valor unitário de R$ " + v.getProduto().getPrecoVenda() +
				".\nFoi realizado uma venda de " + v.getQuantidade() + " " + 
				v.getProduto().getDescricao() + " em um valor total de R$ " + v.getValorVenda() );
	}

}
