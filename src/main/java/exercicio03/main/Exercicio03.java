package exercicio03.main;

import exercicio03.model.Guerreiro;
import exercicio03.model.Mago;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {
        List<String> magias = new ArrayList<>();
        magias.add("cura");
        magias.add("fogo");
        magias.add("água");

        //criar lista de habilidades
        List<String> habilidades = new ArrayList<>();
        habilidades.add("soco forte");
        habilidades.add("soco fraco");
        habilidades.add("esquiva");

        //criar mago
        Mago mago = new Mago("Harry", 50, 75, 30d,40, 15, 2, magias);
        Mago mago2 = new Mago("Rony", 50, 75, 30d,40, 15, 2, magias);

        //criar guerreiro
        Guerreiro guerreiro = new Guerreiro("Conan", 75,50,30d, 20, 35, 2, habilidades );

        guerreiro.mostrarPersonagem();
        System.out.println("Ataque de Guerreiro: " + guerreiro.atack() + "\n");
        guerreiro.lvlUp();
        guerreiro.mostrarPersonagem();
        System.out.println("Ataque de Guerreiro: " + guerreiro.atack() + "\n");
        System.out.println("\n------------------------------------------------------\n");

        mago.mostrarPersonagem();
        System.out.println("Ataque de mago: " + mago.atack() + "\n");
        mago.lvlUp();
        mago.mostrarPersonagem();
        System.out.println("Ataque de mago: " + mago.atack() + "\n");

        mago.aprenderMagia("gelo");
        System.out.println("Magias do Mago: " + magias);

        System.out.println("\n------------------------------------------------------\n");

        guerreiro.aprenderHabilidade("bloqueio");
        System.out.println("Habilidades do guerreiro: " + habilidades);

        System.out.println("\n------------------------------------------------------\n");

        System.out.println("Quantidade de Guerreiros: " + Guerreiro.contadorPersonagem());
        System.out.println("Quantidade de Magos: " + Mago.contadorPersonagem());
    }
}
