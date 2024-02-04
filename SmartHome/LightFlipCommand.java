/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class LightFlipCommand implements ICommand 
{
    Light light;
    
    public LightFlipCommand(Light light)
    {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.flipLight();
    }
}
