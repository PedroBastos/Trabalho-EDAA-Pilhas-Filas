public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE 1: NAVEGADOR ===");
        Navegador nav = new Navegador();
        nav.navegarPara("google.com");
        nav.navegarPara("github.com");
        nav.voltar();
        nav.avancar();

        System.out.println("\n=== TESTE 2: HOSPITAL ===");
        SistemaHospital hospital = new SistemaHospital();
        hospital.gerarSenha("Pedro Bastos");
        hospital.gerarSenha("Maria Silva");
        hospital.chamarProximo();
        hospital.exibir();
    }
}