
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(3);
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}


//You turned, but there's no quarter
//You need to pay first
