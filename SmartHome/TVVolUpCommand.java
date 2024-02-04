/**
 * Concrete Command  - encapsulates receiver and binds receiver to possible action
 */

public class TVVolUpCommand extends TVCommand implements ICommand 
{
    public TVVolUpCommand(TV tv)
    {
        super(tv);
    }
    
    @Override
    public void execute() {
        tv.volumeUp();
    }
}
