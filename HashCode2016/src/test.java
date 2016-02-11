import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class test {
	public static GlobalData global;

	public static void main(String[] args) {
		global = new GlobalData();
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

	private static void readFromFile() throws FileNotFoundException {
		File plik = new File("busy_day.in");
		Scanner scanner = new Scanner(plik);

		String line = scanner.nextLine();

		Scanner stringScanner = new Scanner(line);

		global.serRows(stringScanner.nextInt());
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
				global.warehouseList.se
				warehouse[w].setcostamprodukt(stringScanner.nextInt(), i);
			}

		}

		stringScanner = new Scanner(scanner.nextLine());
		global.setOrdersCount(stringScanner.nextInt());

		for (int o=0; o <global.getOrdersCount(); ++o) {

			stringScanner = new Scanner(scanner.nextLine());
			order[o].setDestination(stringScanner.nextInt(), stringScanner.nextInt());

			stringScanner = new Scanner(scanner.nextLine());
			order[o].setTotalProductCount(stringScanner.nextInt());


			for (int i=0 ; i < orderCount ; ++i) {
				stringScanner = new Scanner(scanner.nextLine());

				order[o].addToListOfProducts(stringScanner.nextInt());
			}

		}


	}

}
