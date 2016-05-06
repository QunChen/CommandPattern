
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver=new Receiver();
		Command command1=new ConcreteCommand1(receiver);
		Command command2=new ConcreteCommand2(receiver);
		
		Invoker invoker=new Invoker();
		invoker.addCommand(command1);
		invoker.addCommand(command2);
		invoker.addCommand(command1);
		
		Client client=new Client(invoker);
		client.action121();
	}

}
