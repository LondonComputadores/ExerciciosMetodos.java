package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println();

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,18);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2.5);

        System.out.println(" ");

        // Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println(" ");

        // Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, 5);

    }
}