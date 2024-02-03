public class TVVolDownCommand implements ICommand 
{
    TV tv;
    
    public TVVolDownCommand(TV tv)
    {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.volumeDown();
    }
}
