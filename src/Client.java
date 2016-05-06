
public class Client {

	private Invoker invoker;

	public Client(Invoker invoker) {
		super();
		this.invoker = invoker;
	}

	public void action121(){
		invoker.execute();
	}
	
}
