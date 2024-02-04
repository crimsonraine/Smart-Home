/**
 * Concrete Command
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
