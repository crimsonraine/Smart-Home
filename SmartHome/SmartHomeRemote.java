/**
 * Invoker - requests command to be carried out
 */

public class SmartHomeRemote  
{
    private ICommand command; // reference to command
    
    public void setCommand(ICommand command) {
        this.command = command;
    }
    
    public void executeCommand() {
        command.execute();
    }
}
