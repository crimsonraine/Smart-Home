/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class TVPlayPauseCommand implements ICommand 
{
    TV tv;
    
    public TVPlayPauseCommand(TV tv)
    {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.playPause();
    }
}
