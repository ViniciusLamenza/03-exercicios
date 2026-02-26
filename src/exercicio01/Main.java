package exercicio01;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        //se o numero existir, será colocado no lugar do #, caso contrário, se tornará 0
        double valor;

        System.out.print("Correntista --> ");
        conta.correntista = entrada.next();
        conta.numero = random.nextInt(1000,9999);
        System.out.print("Saldo Inicial R$ " + decimalFormat.format(conta.saldo));

        System.out.println();
        System.out.println("Valor para depósito R$ ");
        valor = entrada.nextDouble();
        conta.depositar(valor);

        System.out.println();
        System.out.println("Saldo Atual R$ " + decimalFormat.format(conta.saldo));
        System.out.print("Valor para saque R$ ");
        valor = entrada.nextDouble();
        conta.sacar(valor);
        System.out.println("Saldo Atual R$ " + decimalFormat.format(conta.saldo));


    }
}
