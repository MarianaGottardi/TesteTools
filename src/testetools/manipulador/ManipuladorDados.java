
package testetools.manipulador;

import java.io.IOException;
import java.util.ArrayList;
import testetools.Clientes;
import testetools.ListarDados;
import testetools.Vendas;
import testetools.Vendedores;

/**
 *
 * @mariana santos
 */
public class ManipuladorDados {
        private ManipuladorArquivos leitor;
	private ListarDados listas;
	
	public void iniciarleituraDados() throws IOException {
		leitor = new ManipuladorArquivos();
			ArrayList <String> dadosCarregados = leitor.LerDados();
			criarListas(dadosCarregados);
			criarDadosRespostas();


}

	private void criarDadosRespostas() throws IOException {
		Integer qntdCliente=listas.getListaDeClientes().size();
		Integer	qntdVendedor = listas.getListaDeVendedor().size();
		String idMaiorVenda = idVendaMaiorValor();
		String vendedorMaisVendeu = vendedorMenosVendeu();
		leitor.CriarArquivo(qntdCliente, qntdVendedor, idMaiorVenda, vendedorMaisVendeu);
		
	}

	private String vendedorMenosVendeu() {
		// Aqui devemos calcular quem vendeu menos por hora so vou retornar o menor valor
		String nomeVendedor=null;
		Double	menorValor=null;
		for(Vendas v : listas.getListaDeVendas()) {
			if(menorValor==null || v.getPrecoItem()< menorValor ) {
				menorValor=v.getPrecoItem();
				nomeVendedor=v.getNomeVendedor();
			}
		}
		return nomeVendedor;
	}

	private String idVendaMaiorValor() {
		String idMaiorVenda = null;
		Double maiorValor= null;
		for(Vendas v : listas.getListaDeVendas()) {
			if( maiorValor==null || v.getPrecoItem()> maiorValor ) {
				maiorValor=v.getPrecoItem();
				idMaiorVenda=v.getIdVenda();
			}
		}
		return idMaiorVenda;
	}

	private void criarListas(ArrayList<String> dadosCarregados) {
		this.listas = new ListarDados();
                dadosCarregados.stream().map((linha) -> linha.split(";")).forEachOrdered((dados) -> {
                    validarTipoDado(dados);
            });
		
	
	}

	private void validarTipoDado(String[] dados) {
		if(dados[0].equals("001")) {
			adicionarVendedor(dados);
		}
		if(dados[0].equals("002")) {
			adicionarCliente(dados);
		}
		if(dados[0].equals("003")) {
			adicionarVenda(dados);
		}
		
	}

	private void adicionarVenda(String[] dados) {
		Vendas venda = new Vendas();	
		venda.setNumero(dados[0]);
		venda.setIdVenda(dados[1]);
		venda.setIdItem(dados[2]);
		venda.setQntItem(dados[3]);
		venda.setPrecoItem(Double.valueOf(dados[4]));
		venda.setNomeVendedor(dados[5]);
		this.listas.adicionarVendas(venda);
	}

	private void adicionarCliente(String[] dados) {
		Clientes cliente = new Clientes();
		cliente.setNumero(dados[0]);
		cliente.setCNPJ(dados[1]);
		cliente.setNome(dados[2]);
		cliente.setRamo(dados[3]);
		this.listas.adicionarCliente(cliente);
	}

	private void adicionarVendedor(String[] dados) {
		Vendedores vendedor = new Vendedores();
		vendedor.setNumero(dados[0]);
		vendedor.setCpf(dados[1]);
		vendedor.setNome(dados[2]);
		vendedor.setSalario(dados[3]);
		this.listas.adiciconarVendedor(vendedor);
	}

    
}
