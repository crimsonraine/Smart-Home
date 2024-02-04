/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class TVOnOffCommand extends TVCommand implements ICommand 
{
    public TVOnOffCommand(TV tv)
    {
        super(tv);
    }
    
    @Override
    public void execute() {
        tv.toggleTV();
    }
}
