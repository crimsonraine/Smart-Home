/**
 * Concrete Command
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
