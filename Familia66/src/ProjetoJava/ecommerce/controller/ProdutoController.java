package ProjetoJava.ecommerce.controller;

import java.util.ArrayList;

import ProjetoJava.ecommerce.model.Produto;
import ProjetoJava.ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{

    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    int numero = 0;

    @Override
    public void procurarPorNumero(int numero){
        var produto = buscarNaCollection(numero);

        if (produto != null)
            produto.visualizar();
        else
            System.out.println("\n O Produto Número: "+ numero + " não foi encontrado !");
    }

    @Override
    public void listarTodos(){
        for (var produto: listaProdutos){
            produto.visualizar();
        }

    }

    @Override
    public void listarPorTipo(int tipo){
        for (var produto: listaProdutos){
            if (produto.getTipo() == tipo){
                produto.visualizar();
            }
        }
    }

    public int gerarNumero(){
        return ++ numero;
    }
    
    public Produto buscarNaCollection(int numero){
        for (var produto : listaProdutos) {
            if (produto.getNumIdentificador() == numero){
                return produto;
            }
        }
        return null;
    }

    @Override
    public void cadastrar(Produto produto){
        listaProdutos.add(produto);
        System.out.printf("\nO Produto %s foi criado com sucesso!", produto.getNome());
    }

    public void atualizar(Produto produto) {
        var listaProduto = buscarNaCollection(produto.getNumIdentificador());

        if(listaProduto != null){
            listaProdutos.set(listaProdutos.indexOf(listaProduto), produto);
            System.out.printf("\nO Produto %s foi atualizada com sucesso!", produto.getNome());
        } else 
            System.out.println("\nO Produto com o Número Identificador: "+ produto.getNumIdentificador() + " não foi encontrado!");
    }

    public int retornaTipo(int numero){
        for (var produto : listaProdutos){
            if (produto.getNumIdentificador() == numero ){
                return produto.getTipo();
            }
        }
        return 0;
    }

    @Override
    public void deletar(int numero){
        var produto = buscarNaCollection(numero);
        var nomeProduto = produto.getNome();
        if(produto != null){
            if (listaProdutos.remove(produto) == true) 
                System.out.printf("\nO Produto %s foi deletada com sucesso!", nomeProduto);
        } 
        else
            System.out.printf("\nO Produto com o Numero Identificador %d não foi encontrado!", numero);
    }

}