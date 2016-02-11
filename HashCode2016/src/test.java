import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class test {
	public static GlobalData global;

	public static void main(String[] args) throws FileNotFoundException {
		global = new GlobalData();
		readFromFile();
		global.PrintAllData();
		OrderQueue orderQueue = new OrderQueue();
		
		for(int t=0; t<global.getTurns(); ++t){
			for(int d=0; d<global.getDroneCount(); ++d)
				if(global.dronesList.get(d).state == DroneState.READY)
					assignWorktoDrone();
		} 
		
	}
	
	private static void assignWorktoDrone() {
	 	for(int o=0;o<global.getOrdersCount();++o){
			if(global.orderList.get(o).getState() == OrderState.PENDING){
				commandDrone();
				printCommand();
			}
		} 
	}
	
	private static void commandDrone(){
		
	}
	
	private static void printCommand(){
		
	}

	private static void readFromFile() throws FileNotFoundException {
		File plik = new File("busy_day.in");
		Scanner scanner = new Scanner(plik);

		String line = scanner.nextLine();

		Scanner stringScanner = new Scanner(line);

		global.setRows(stringScanner.nextInt());
		global.setColumns(stringScanner.nextInt());
		global.setDroneCount(stringScanner.nextInt());
		global.setTurns(stringScanner.nextInt());
		global.setMaxLoad(stringScanner.nextInt());

		stringScanner = new Scanner(scanner.nextLine());
		global.setProductTypeCount(stringScanner.nextInt());

		stringScanner = new Scanner(scanner.nextLine());
		int i = 0;
		global.productType = new ArrayList<Product>();
		while(stringScanner.hasNextInt()){
			global.productType.add(new Product(i,stringScanner.nextInt()));
			++i;
		}

		stringScanner = new Scanner(scanner.nextLine());
		global.setWarehouses(stringScanner.nextInt());

		global.warehouseList = new ArrayList<Warehouse>();
		for (int w = 0; w < global.getWarehouseCount() ; ++w) {
			stringScanner = new Scanner(scanner.nextLine());
			global.warehouseList.add(new Warehouse(new Coordinates(stringScanner.nextInt(), stringScanner.nextInt()), w));
			
			stringScanner = new Scanner(scanner.nextLine());
			for (i=0; i<global.getProductTypeCount(); ++i) {
				global.warehouseList.get(w).setAvailableProductType(stringScanner.nextInt(), i);
			}

		}

		stringScanner = new Scanner(scanner.nextLine());
		global.setOrdersCount(stringScanner.nextInt());
		global.orderList = new ArrayList<Order>();
		for (int o=0; o <global.getOrdersCount(); ++o) {

			stringScanner = new Scanner(scanner.nextLine());
			global.orderList.add(new Order(new Coordinates(stringScanner.nextInt(),stringScanner.nextInt())));

			stringScanner = new Scanner(scanner.nextLine());
			int orderProducts = stringScanner.nextInt();
			
			stringScanner = new Scanner(scanner.nextLine());
			for (i=0 ; i < orderProducts ; ++i) {
				//global.orderList.get(o).getProducts() = new ArrayList<Product>();
				global.orderList.get(o).getProducts().add(new Product(global.productType.get(stringScanner.nextInt())));
			}

		}


	}

}
