/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class TVBackCommand extends TVCommand implements ICommand 
{
    public TVBackCommand(TV tv)
    {
        super(tv);
    }
    
    @Override
    public void execute() {
        tv.back();
    }
}
