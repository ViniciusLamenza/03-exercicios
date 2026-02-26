package exercicio02;

public class Paciente {
    String nome;
    int idade;

    public int frequenciaMaxima() {
        return 220 - idade;
    }

    public double[] frequenciaAlvo() { //retornou vetor, para voltar dois metodos, por isso o uso do []
        double[] alvo = new double[2]; //tudo que tem new, é objeto
        int fm = frequenciaMaxima();
        alvo[0] = fm * 0.5;
        alvo[1] = fm * 0.85;
        return alvo;
    }
}
