import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<Command> commands;

	public Invoker() {
		super();
		commands=new ArrayList<Command>();
	}
	
	public void addCommand(Command command){
		commands.add(command);
	}
	
	public void execute(){
		for(Command command:commands){
			command.execute();
		}
	}
	
}
