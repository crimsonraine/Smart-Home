public class TVSkipCommand implements ICommand 
{
    TV tv;
    
    public TVSkipCommand(TV tv)
    {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.skip();
    }
}
