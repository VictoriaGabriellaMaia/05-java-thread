package tarefa;

/* 
 * Herdando a classe Thread (Abordagem Clássica)
 * Nesta abordagem, sua classe se torna uma Thread propriamente dita. 
 * É uma forma simples, mas limita seu código, pois sua classe não 
 * poderá herdar outras classes, pois, em Java, não há herança múltipla.
 */

// Herda diretamente os "superpoderes" da classe Thread:
public class MinhaThread extends Thread {
    @Override
    public void run() {
        System.out.println("Executando código dentro da linha de execução: " + this.getName());
    }
}