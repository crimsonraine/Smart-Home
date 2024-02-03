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
