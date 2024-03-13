package javacore.Minterfaces.dominio;

public class FileLoader extends DataRemover implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }
    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no arquivo");
    }
}
