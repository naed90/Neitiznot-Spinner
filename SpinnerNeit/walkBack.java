package SpinnerNeitTasks;

import org.powerbot.script.rt6.ClientContext;

public class walkBack extends Task{

	public walkBack(ClientContext arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean activate() {
		return numberOfFlaxInInv()==0 && !bank.inViewport();
	}

	@Override
	public void execute() {
		System.out.println("Going back");
		ctx.movement.step(bank.nearest());//new Tile(2354, 3796, 0));
		sleep(4320);
		
	}

}
