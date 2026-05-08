package suporte.intelbras;

public class App {
    public static void main(String[] args) {
Variacoes v = new Variacoes();
    while (true) {
        System.out.println("\n--- Gerador de Variacoes Intelbras ---");
        String senha = IO.readln("Entre com o chute de senha (ou 'sair'): ");
        
        if (senha.equalsIgnoreCase("sair")) break;

        v.gerarVariacao(senha);
        System.out.println("\nSenhas geradas:");
        v.listarVariacoes();
        
        System.out.println("\n--------------------------------------");

        IO.readln("Pressione ENTER para nova consulta...");
        }
    }
}
