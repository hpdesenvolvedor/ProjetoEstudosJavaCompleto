package javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String tipo;


    TipoCliente(int valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public static TipoCliente tipoClientePorNomeRelatorio (String nomeRelatorio){
        for (TipoCliente tipo : values()) {
            if (tipo.getTipo().equals(nomeRelatorio)){
                return tipo;
            }
            
        }
        return null;


    }



    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }
}
