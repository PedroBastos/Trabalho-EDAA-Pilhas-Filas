import java.util.Stack;

public class Navegador {
    private Stack<String> pVoltar = new Stack<>();
    private Stack<String> pAvancar = new Stack<>();
    private String pagAtual = null;

    public void navegarPara(String novaPagina) {
        if (pagAtual != null) pVoltar.push(pagAtual);
        pagAtual = novaPagina;
        pAvancar.clear();
        exibir();
    }

    public void voltar() {
        if (pVoltar.isEmpty()) {
            System.out.println("Botão Voltar desativado.");
            return;
        }
        pAvancar.push(pagAtual);
        pagAtual = pVoltar.pop();
        exibir();
    }

    public void avancar() {
        if (pAvancar.isEmpty()) {
            System.out.println("Botão Avançar desativado.");
            return;
        }
        pVoltar.push(pagAtual);
        pagAtual = pAvancar.pop();
        exibir();
    }

    private void exibir() {
        System.out.println("\nPagina Atual: " + pagAtual);
        System.out.println("Voltar: " + (pVoltar.isEmpty() ? "OFF" : "ON " + pVoltar));
        System.out.println("Avançar: " + (pAvancar.isEmpty() ? "OFF" : "ON " + pAvancar));
    }
}