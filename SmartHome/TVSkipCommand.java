/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class TVSkipCommand implements ICommand 
{
    TV tv;
    
    public TVSkipCommand(TV tv)
    {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.skip();
    }
}
