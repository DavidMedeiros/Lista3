package Q4;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
			
		banco.criaContaBancaria("David", 140, 50, "conta normal");
		banco.criaContaBancaria("Neto", 1000, 500, "conta elite");
		banco.criaContaBancaria("Bianca", 400, 100, "conta estudante");
		banco.criaContaBancaria("Ana", 500, 50, "conta poupanca");
		
		System.out.println(banco.getListaDeContas());
		
		banco.fecharConta("Ana");
		
		System.out.println(banco.getListaDeContas());
		
		banco.verificarFinanciamento("David");
		banco.verificarFinanciamento("Neto");
		banco.verificarFinanciamento("Bianca");
		
		banco.verificarProjecao("David", 3, 100);
		banco.verificarProjecao("Neto", 5, 110);
		banco.verificarProjecao("Bianca", 2, 500);
		
		banco.financiamentoTotal();
		
		banco.ordenaContas();
		System.out.println(banco.getListaDeContas());
	}
}
