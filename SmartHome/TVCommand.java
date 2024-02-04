/**
 * Write a description of class TVCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class TVCommand implements ICommand 
{
    TV tv;
    
    public TVCommand(TV tv)
    {
        this.tv = tv;
    }

    public abstract void execute();
}
