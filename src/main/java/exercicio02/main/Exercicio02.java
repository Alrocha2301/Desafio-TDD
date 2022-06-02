package exercicio02.main;

import exercicio02.model.Livro;
import exercicio02.model.Loja;
import exercicio02.model.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry Potter", 40d, 50, "J. K. Rowling", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Anéis", 60d, 30, "J. R. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20d, 50, "GFT", "educativo", 500);

        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        VideoGame ps4 = new VideoGame("PS4", 1800d, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000d, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500d, 500, "Microsoft", "One", false);

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja loja = new Loja("Americanas", "12345678", livros, games);

        l2.calcularImposto();
        l3.calcularImposto();

        ps4.calcularImposto();
        ps4Usado.calcularImposto();

        //livros.clear();
        loja.listaLivros();
        loja.listaVideoGames();
        System.out.println("O patrimônio da loja " + loja.getNome() + " é de R$ " + loja.calculaPatrimonio(livros, games));


    }
}
