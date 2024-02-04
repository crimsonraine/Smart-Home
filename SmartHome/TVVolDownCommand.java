/**
 * Concrete Command  - encapsulates receiver and binds receiver to possible action
 */

public class TVVolDownCommand extends TVCommand implements ICommand 
{
    public TVVolDownCommand(TV tv)
    {
        super(tv);
    }
    
    @Override
    public void execute() {
        tv.volumeDown();
    }
}
