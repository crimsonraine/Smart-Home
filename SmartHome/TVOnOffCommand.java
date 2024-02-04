/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class TVOnOffCommand implements ICommand 
{
    TV tv;
    
    public TVOnOffCommand(TV tv)
    {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.toggleTV();
    }
}
