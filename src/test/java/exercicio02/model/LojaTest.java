package exercicio02.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LojaTest {

    Loja loja;
    List<Livro> livros;
    Livro livro;
    List<VideoGame> videoGames;
    VideoGame videoGame;

    @BeforeEach
    public void setup() {
        loja = new Loja();
        livros = new ArrayList<>();
        livro = new Livro();
        videoGames = new ArrayList<>();
        videoGame = new VideoGame();
        loja.setNome("nome da loja");
        loja.setLivros(livros);
        loja.setVideoGames(videoGames);

    }

    @Test
    public void deveAdicionarLivroNaListaDeEstoque() {
        int numeroDeLivros = livros.size();
        livro.setQtd(2);
        loja.adicionarLivro(livro);
        assertEquals(numeroDeLivros + 1 , livros.size());
    }

    @Test
    public void deveRecusarAdicionarLivroComQuantidadeZero() {
        int numeroDeLivros = livros.size();
        livro.setQtd(0);
        loja.adicionarLivro(livro);
        assertEquals(numeroDeLivros, livros.size());
    }

    @Test
    public void deveMostrarListaDeLivrosExcluindoComQuantidadeZerada() {
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Livro l3 = new Livro();
        l1.setQtd(4);
        l2.setQtd(5);
        l3.setQtd(0);
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        loja.listaLivros();
        assertFalse(livros.isEmpty());
    }

    @Test
    public void deveAdicionarVideoGameNaListaDeEstoque() {
        int numeroDeLivros = videoGames.size();
        videoGame.setQtd(2);
        loja.adicionarVideoGame(videoGame);
        assertEquals(numeroDeLivros + 1 , videoGames.size());
    }

    @Test
    public void deveRecusarAdicionarVideoGameComQuantidadeZero() {
        int numeroDeGames = videoGames.size();
        videoGame.setQtd(0);
        loja.adicionarVideoGame(videoGame);
        assertEquals(numeroDeGames, videoGames.size());
    }

    @Test
    public void deveMostrarListaDeVideoGamesExcluindoOsComQuantidadeZerada() {
        VideoGame game1 = new VideoGame();
        VideoGame game2 = new VideoGame();
        VideoGame game3 = new VideoGame();
        game1.setQtd(4);
        game2.setQtd(5);
        game3.setQtd(0);
        videoGames.add(game1);
        videoGames.add(game2);
        videoGames.add(game3);
        loja.listaVideoGames();
        assertFalse(videoGames.isEmpty());
    }

    @Test
    public void deveCalcularPatrimonioDaLoja() {
        Livro l1 = new Livro();
        l1.setQtd(4);
        l1.setPreco(50d);
        livros.add(l1);
        VideoGame game1 = new VideoGame();
        game1.setQtd(4);
        game1.setPreco(1000d);
        videoGames.add(game1);

        assertEquals(4200d, loja.calculaPatrimonio(livros, videoGames));
    }



}
