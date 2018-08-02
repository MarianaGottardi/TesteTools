package testetools;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @mariana santos
 */
public class TesteTools {

    public static void main(String... args) throws FileNotFoundException {

        try {
            FileReader clientes = new FileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\TesteTools\\src\\dados\\in\\teste.dat");
            Scanner ler = new Scanner(clientes).useDelimiter("[;]");

            List<Vendedores> vendedores = new ArrayList<>();
            List<Clientes> cli = new ArrayList<>();
            // List<Vendas> vendas = new ArrayList<>();
            while (ler.hasNext()) {
                if (ler.next().equals("001")) {
                    Vendedores vendedor = new Vendedores();
                    vendedor.setNome(ler.next());
                    vendedor.setCpf(ler.next());
                    vendedor.setSalario(Double.valueOf(ler.next()));
                    vendedores.add(vendedor);
                }
                if (ler.next().equals("002")) {
                    Clientes cliente = new Clientes();
                    cliente.setCNPJ(ler.next());
                    cliente.setNome(ler.next());
                    cliente.setRamo(ler.next());
                    cli.add(cliente);
                }
                /* 
               Resolver essa parte do código e  fazer os métodos:
                1. Quantidade de Clientes:  
                2. Quantidade de Vendedores: 
                3. ID da Venda de valor mais alto:
                4. Nome do Vendedor que menos vendeu: 
//                } else if (ler.next().equals("003")) {
//                    Vendas venda = new Vendas();
//                    venda.setIdvenda(Integer.parseInt(ler.next()));
//                    venda.setIdItem(Long.getLong(ler.next()));
//                    venda.setQtdItem(Integer.parseInt(ler.next()));
//                    venda.setPrecoItem(Double.valueOf(ler.next()));
//                    venda.setNomeVendedor(ler.next());
//                    vendas.add(venda);
//                   
//                }
//          */

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");

        }
    }
}
