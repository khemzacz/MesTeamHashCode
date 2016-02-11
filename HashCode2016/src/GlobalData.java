import java.util.ArrayList;

public class GlobalData {

GlobalData(){
	dronesList = new ArrayList<Drone>();
	orderList = new ArrayList<Order>();
	warehouseList = new ArrayList<Warehouse>();
	productType = new ArrayList<Product>();
}
	
	private static int rows;
	private static int columns;
	private static int droneMaxLoad;
	private static int turnsCount;
	private static int productTypeCount;
	
	private static int warehousesCount;
	public static ArrayList<Warehouse> warehouseList;
	
	private static int droneCount; 
	public static ArrayList<Drone> dronesList;
	
	private static int ordersCount;
	public static ArrayList<Order> orderList;
	
	public static ArrayList<Product> productType;

	public static int getRows(){
		return rows;
	}
	
	public static int getMaxLoad(){
		return droneMaxLoad;
	}
	
	public static int getTurns(){
		return turnsCount;
	}
	
	public static int getColumns(){
		return columns;
	}	
	
	public static int getWarehouseCount(){
		return warehousesCount;
	}
	
	public static int getDroneCount(){
		return droneCount;
	}
	
	public static int getOrdersCount(){
		return ordersCount;
	}
	
	public static int getProductTypeCount(){
		return productTypeCount;
	}
	
	public static void setRows(int r){
		rows=r;
	}
	
	public static void setMaxLoad(int m){
		droneMaxLoad=m;
	}
	
	public static void setColumns(int c){
		columns=c;
	}	
	
	public static void setTurns(int t){
		turnsCount=t;
	}
	
	public static void setWarehouses(int w){
		warehousesCount=w;
	}
	
	public static void setDroneCount(int c){
		droneCount=c;
	}
	
	public static void setOrdersCount(int o){
		ordersCount=o;
	}
	
	public static void setProductTypeCount(int p){
		productTypeCount=p;
	}
	
	
	public static void PrintAllData()
	{
		System.out.println("rows: " + rows+ "\t columns:" + columns);
		System.out.println("MaxDroneLoad:  " + droneMaxLoad);
		System.out.println("Turns: " + turnsCount);
		System.out.println("ProductTypesCount: " + productTypeCount);
		System.out.println("Turns: " + turnsCount);
		System.out.println("WarehousesCount: " + warehousesCount);
		System.out.println("DroneCount: " + droneCount);
		System.out.println("OrdersCount: " + ordersCount);
		
		
	}
	
}
