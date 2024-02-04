/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public abstract class LightCommand implements ICommand 
{
    Light light;
    
    public LightCommand(Light light)
    {
        this.light = light;
    }
    
    public abstract void execute();
}
