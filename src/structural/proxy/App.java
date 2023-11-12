package structural.proxy;

public class App {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Admin", "wrong");
        try {
            executor.runCommand("dir");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
