package exercicio02.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    String nome;
    String cnpj;
    List<Livro> livros = new ArrayList<>();
    List<VideoGame> videoGames = new ArrayList<>();

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public Loja() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        livros.removeIf(livro -> livro.getQtd() == 0);
        if (livros.isEmpty()) {
            System.out.println("A loja " + getNome() + " não tem livros no seu estoque.");
        } else {
            System.out.println("A Loja " + getNome() + " possui estes livros para venda: ");
            for (Livro livro : livros) {
                System.out.println("Título: " + livro.getNome() + ", preço: " + livro.getPreco() + ", quantidade: " + livro.getQtd() + " em estoque.");
            }
        }
    }

    public void adicionarLivro(Livro livro) {
        if (livro.getQtd() > 0) {
            livros.add(livro);
        }
    }

    public void adicionarVideoGame(VideoGame videoGame) {
        if (videoGame.getQtd() != 0) {
            videoGames.add(videoGame);
        }
    }

    public void listaVideoGames() {
        videoGames.removeIf(videoGame -> videoGame.getQtd() == 0);
        if (videoGames.isEmpty()) {
            System.out.println("A loja " + getNome() + " não tem vídeo games no seu estoque.");
        } else {
            System.out.println("A Loja " + getNome() + " possui estes vídeo games para venda: ");
            for (VideoGame videoGame : videoGames) {
                System.out.println("Título: " + videoGame.getNome() + " " + videoGame.getModelo() + ", preço: " + videoGame.getPreco() + ", quantidade: " + videoGame.getQtd() + " em estoque.");
            }
        }
    }

    public Double calculaPatrimonio(List<Livro> livros, List<VideoGame> videoGames) {
        Double totalLivros = 0d;
        Double totalVideoGames = 0d;
        for (Livro livro: livros) {
            totalLivros += livro.getPreco() * livro.getQtd();
        }
        for (VideoGame videoGame: videoGames) {
            totalVideoGames += videoGame.getPreco() * videoGame.getQtd();
        }
        return totalLivros + totalVideoGames;
    }

}

