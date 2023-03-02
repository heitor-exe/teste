public class Teste {

    Dev dev = new Dev();

    public void salve() {
        System.out.println("alterado no git");
    }

    public static void main(String[] args) {
        System.out.println("teste");
        Teste teste = new Teste();
        teste.salve();

        Dev dev = new Dev();
        dev.mensagem();
    }

}
