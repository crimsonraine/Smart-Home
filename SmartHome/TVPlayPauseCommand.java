/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class TVPlayPauseCommand extends TVCommand implements ICommand 
{
    public TVPlayPauseCommand(TV tv)
    {
        super(tv);
    }
    
    @Override
    public void execute() {
        tv.playPause();
    }
}
