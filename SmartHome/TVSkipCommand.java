/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class TVSkipCommand extends TVCommand implements ICommand 
{
    public TVSkipCommand(TV tv)
    {
        super(tv);
    }
    
    @Override
    public void execute() {
        tv.skip();
    }
}
