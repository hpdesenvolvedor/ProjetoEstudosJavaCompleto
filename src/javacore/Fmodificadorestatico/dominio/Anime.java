package javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1 - Alocado espaco em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicializacao é executado
    // 4 - Contrutor é executado
    static {
        System.out.println("Dentro do bloco de inicialização 1");
    }
    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

        for (int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();

    }
}
