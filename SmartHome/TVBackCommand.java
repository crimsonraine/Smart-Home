/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class TVBackCommand implements ICommand 
{
    TV tv;
    
    public TVBackCommand(TV tv)
    {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.back();
    }
}
