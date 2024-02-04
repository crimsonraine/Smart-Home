/**
 * Invoker
 */

public class SmartHomeRemote  
{
    // instance variables - replace the example below with your own
    private ICommand command;
    
    public void setCommand(ICommand command) {
        this.command = command;
    }
    
    public void executeCommand() {
        command.execute();
    }
}
