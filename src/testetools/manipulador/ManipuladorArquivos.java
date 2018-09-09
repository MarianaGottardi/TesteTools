
package testetools.manipulador;

/**
 *
 * @mariana santos 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ManipuladorArquivos {

	private BufferedReader buffRead;
	private BufferedWriter buffWrite ; 
	private final String nomeArquivo= "teste";
	private final String caminhoEntrada = "C:\\Users\\user\\Documents\\NetBeansProjects\\TesteTools\\src\\dados\\in\\teste.dat";
	private final String caminhoSaida = "C:\\Users\\user\\Documents\\NetBeansProjects\\TesteTools\\src\\dados\\out\\arquivo de saida.dat";

	public ArrayList<String> LerDados() throws IOException {
		ArrayList<String> dados= new ArrayList<>();
		String linha= null;
	
			buffRead = new BufferedReader(new InputStreamReader(new FileInputStream(this.caminhoEntrada)));
			 while ((linha = buffRead.readLine()) != null) {
		        	dados.add(linha);
		        	
		        	}
			
			  buffRead.close();
		return dados;
	}
	
	public void CriarArquivo(Integer qntdCliente,Integer qntdVendedor,String idMaiorVenda,String vendedorMaisVendeu) throws IOException {	
		
		File file = new File (caminhoSaida+"/"+nomeArquivo+".dat.proc");
		BufferedWriter bufferedWrite = new BufferedWriter(new FileWriter(file));
		buffWrite.append("Quantidade de cliente: " +qntdCliente+ "\n");
		buffWrite.append("Quantidade de Vendedores: " +qntdVendedor+ "\n");
		buffWrite.append("ID da Venda de valor mais alto: " +idMaiorVenda + "\n");
		buffWrite.append("Nome do Vendedor que menos vendeu: " + vendedorMaisVendeu+"\n");
		buffWrite.close();
		System.out.println("fim da criação de arquivo");
		
		
	}
}
