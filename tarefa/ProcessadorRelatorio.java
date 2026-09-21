package tarefa;

public class ProcessadorRelatorio extends Thread {

    public ProcessadorRelatorio(String nomeDepartamento) {
        this.setName(nomeDepartamento);
    }

    @Override
    public void run() {
        for (int pagina = 1; pagina <= 3; pagina++) {
            System.out.println("[" + this.getName() + "] Gerando página " + pagina + "...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("[" + this.getName() + "] Relatório finalizado!");
    }
}
