/**
 * Concrete Command  - encapsulates receiver and binds receiver to possible action
 */

public class TVVolDownCommand implements ICommand 
{
    TV tv;
    
    public TVVolDownCommand(TV tv)
    {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.volumeDown();
    }
}
