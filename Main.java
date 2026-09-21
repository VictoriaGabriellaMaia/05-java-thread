import tarefa.ProcessadorRelatorio;

public class Main {

    public static void main(String[] args) {

        ProcessadorRelatorio faturamento =
                new ProcessadorRelatorio("Faturamento");

        ProcessadorRelatorio vendas =
                new ProcessadorRelatorio("Vendas");

        faturamento.start();
        vendas.start();

        System.out.println("Relatórios iniciados!");
    }
}
