package br.com.fiap.nac.exercicio03;

public class TesteBanco {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Han Solo", "111.222.333-44");
		ContaCorrente cc = new ContaCorrente(p, 123);
		cc.setSaldo(1530.0);
		
		System.out.println("O cliente " + cc.getTitular().getNome() + " portador do CPF " + 
				cc.getTitular().getCpf() + ", é titular da conta corrente nro " +
				cc.getNumero() + " com um saldo de R$ " + cc.getSaldo());
		
		p = new Pessoa("Leia Organa", "555.666.777-88");
		cc = new ContaCorrente(p, 111, 4532.0);
		
		System.out.println("O cliente " + cc.getTitular().getNome() + " portador do CPF " + 
				cc.getTitular().getCpf() + ", é titular da conta corrente nro " +
				cc.getNumero() + " com um saldo de R$ " + cc.getSaldo());
	}
	
}
