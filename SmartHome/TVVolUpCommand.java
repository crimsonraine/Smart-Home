/**
 * Concrete Command  - encapsulates receiver and binds receiver to possible action
 */

public class TVVolUpCommand implements ICommand 
{
    TV tv;
    
    public TVVolUpCommand(TV tv)
    {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.volumeUp();
    }
}
