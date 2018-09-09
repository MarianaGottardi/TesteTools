
package testetools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @mariana santos
 */
public class ListarDados {
       private final List<Clientes> listaDeClientes;
	private final List<Vendas> listaDeVendas;
	private final List<Vendedores> listaDeVendedor;
	
	public ListarDados() {
		System.out.println("Lista Iniciada");
		this.listaDeClientes = new ArrayList<>();
		this.listaDeVendas = new ArrayList<>();
		this.listaDeVendedor = new ArrayList<>();
	}

	public List<Clientes> getListaDeClientes() {
		return listaDeClientes;
	}

	public void adicionarCliente(Clientes cliente) {
		this.listaDeClientes.add(cliente);
	}

	public List<Vendas> getListaDeVendas() {
		return listaDeVendas;
	}

	public void adicionarVendas(Vendas venda) {
		this.listaDeVendas.add(venda);
	}

	public List<Vendedores> getListaDeVendedor() {
		return listaDeVendedor;
	}

	public void adiciconarVendedor(Vendedores vendedor) {
		this.listaDeVendedor.add(vendedor);
	}
	
}
        
 
