/**
 * Concrete Command - encapsulates receiver and binds receiver to possible action
 */

public class InstructionToggleCommand implements ICommand 
{
    Instructions instructions;
    
    public InstructionToggleCommand(Instructions instructions)
    {
        this.instructions = instructions;
    }
    
    @Override
    public void execute() {
        instructions.toggle();
    }
}
