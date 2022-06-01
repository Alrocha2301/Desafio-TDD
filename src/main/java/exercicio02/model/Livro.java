package exercicio02.model;

import exercicio02.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

    String autor;
    String tema;
    int qtdPaginas;

    public Livro(String nome, Double preco, int qtd, String autor, String tema, int qtdPaginas) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPaginas = qtdPaginas;
    }

    public Livro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    @Override
    public Double calcularImposto() {
        if (!getTema().equals("educativo")) {
            Double imposto = getPreco() * 0.1;
            System.out.printf("R$ %.2f de imposto sobre o livro %s.\n", imposto, getNome());
            return imposto;
        } else {
            System.out.println("Livro educativo não tem imposto: " + getNome() + ".");
            return 0d;
        }
    }
}
