/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class LightFlipCommand extends LightCommand implements ICommand 
{    
    public LightFlipCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.flipLight();
    }
}
