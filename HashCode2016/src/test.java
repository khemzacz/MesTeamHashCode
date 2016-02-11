
public class test {

	public static void main(String[] args) {
		readFromFile();
		createWorld();
		createOrderQueue();
		
		for(int t=0; t<turn; ++t){
			for(int d=0; d<droneList.length; ++d)
				if(droneList(d).state == "BEZROBOTNY")
					assignWorktoDrone();
		}
		
	}
	
	private static void assignWorktoDrone() {
		for(int o=0;o<orderList.length;++o){
			if(orderList(o).state == "NOTSTARTED"){
				commandDrone();
				printCommand();
			}
		}
	}

}
