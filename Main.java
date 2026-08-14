import tarefa.MinhaThread;

public class Main {
    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread();

        thread.setName("Minha Thread A");
        
        // Dispara o método run() em paralelo:
        thread.start(); 

        System.out.println("Fim!");
    }
}