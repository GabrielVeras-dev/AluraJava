public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Aquaman 2";
        meuFilme.anoLancamento = 2023;
        meuFilme.duracaoEmMinutos = 124;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7.8);
        meuFilme.avalia(9);
        meuFilme.avalia(8.5);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        System.out.println("Teste");
        System.out.println("teste2");
    }
}