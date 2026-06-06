import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class SistemaHospital {
    private Queue<String> fila = new LinkedList<>();
    private List<String> historico = new ArrayList<>();
    private int contador = 1;

    public void gerarSenha(String nome) {
        String registro = "SENHA-" + contador++ + " (" + nome + ")";
        fila.add(registro);
        System.out.println("Adicionado: " + registro);
    }

    public void chamarProximo() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }
        String chamado = fila.poll();
        historico.add(chamado);
        System.out.println("📢 CHAMANDO: " + chamado);
    }

    public void exibir() {
        System.out.println("\nFila Atual: " + fila);
        System.out.println("Histórico: " + historico);
    }
}