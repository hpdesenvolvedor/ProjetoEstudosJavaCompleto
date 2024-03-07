package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;

import javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jonathan", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Luka", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
