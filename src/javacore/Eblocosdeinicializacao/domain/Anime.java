package javacore.Eblocosdeinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaco em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicializacao é executado
    // 4 - Contrutor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
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

        for (int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();

    }
}
