package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;

import javacore.Kenum.dominio.TipoPagamento;
import javacore.Kenum.dominio.TipoCliente;



public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jonathan", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Luka", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getTipo());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
