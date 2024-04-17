package Xserializacao.test;

import Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Henrique Nunes", "123454322");
        serializar(aluno);
    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))) {
            oss.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
