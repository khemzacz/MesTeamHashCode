import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

	private static void readFromFile() throws FileNotFoundException {
		File plik = new File("busy_day.in");
		Scanner scanner = new Scanner(plik);

		String line = scanner.nextLine();

		Scanner stringScanner = new Scanner(line);

		row = stringScanner.nextInt();
		columns = stringScanner.nextInt();
		droneCount = stringScanner.nextInt();
		turnsCount = stringScanner.nextInt();
		droneMaxLoad = stringScanner.nextInt();

		stringScanner = new Scanner(scanner.nextLine());
		productTypeCount = stringScanner.nextInt();

		stringScanner = new Scanner(scanner.nextLine());
		int i = 0;
		while(stringScanner.hasNextInt()){
			productType[i].weight = stringScanner.nextInt();
			++i;
		}

		stringScanner = new Scanner(scanner.nextLine());
		warehouseCount = stringScanner.nextInt();

		for (int w = 0; w < warehouseCount ; ++w) {
			stringScanner = new Scanner(scanner.nextLine());
			warehouse[w] = new Warehouse(new Coordinates(stringScanner.nextInt(), stringScanner.nextInt()), w);

			stringScanner = new Scanner(scanner.nextLine());
			for (int i=0; i<productTypeCount; ++i) {
				warehouse[w].setcostamprodukt(stringScanner.nextInt(), i);
			}

		}

		stringScanner = new Scanner(scanner.nextLine());
		orderCount = stringScanner.nextInt();

		for (int o=0; o <orderCount; ++o) {

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
