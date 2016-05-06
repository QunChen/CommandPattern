
public class ConcreteCommand2 implements Command {

	private Receiver receiver;

	public ConcreteCommand2(Receiver receiver) {
		super();
		this.receiver = receiver;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action2();
	}

}
