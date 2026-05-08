package suporte.intelbras;

import java.util.ArrayList;

public class Variacoes {
    private ArrayList<String> variacoesFinais = new ArrayList<>();

    public void gerarVariacao(String senhaOriginal) {
        // começa com uma string vazia
        variacoesFinais.clear();
        processar(senhaOriginal, 0, "");
    }

    private void processar(String senhaOriginal, int indice, String senhaEmConstrucao) {
        // condição para encerrar o processo de recursão
        if(indice == senhaOriginal.length()){
            variacoesFinais.add(senhaEmConstrucao);
            return;
        }

        char atual = senhaOriginal.charAt(indice);

        if(atual == 'l' || atual == 'I') {
            // criando duas senhas com as duas variações
            // vai criar árvores de possibilidades e criar todas as variações
            processar(senhaOriginal, indice + 1, senhaEmConstrucao + 'l');
            processar(senhaOriginal, indice + 1, senhaEmConstrucao + 'I');
        } else {
            processar(senhaOriginal, indice + 1, senhaEmConstrucao + atual);
        }
    }

    public void listarVariacoes() {
        if (variacoesFinais.isEmpty()) return;
        variacoesFinais.forEach(System.out::println);
    }
}
