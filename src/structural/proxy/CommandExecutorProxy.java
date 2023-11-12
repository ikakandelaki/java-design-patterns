package structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private static final String ADMIN_USER_NAME = "admin";
    private static final String ADMIN_USER_PASSWORD = "password";

    private boolean isAdmin;
    private final CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {
        if (ADMIN_USER_NAME.equals(user) && ADMIN_USER_PASSWORD.equals(password)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin || !cmd.trim().startsWith("rm")) {
            executor.runCommand(cmd);
        } else {
            throw new Exception("rm command is not allowed for non-admin users.");
        }
    }
}
