package javacore.Minterfaces.dominio;

public class DatabaseLoader extends DataRemover implements DataLoader {
    // private -> default -> protected - public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }
}
