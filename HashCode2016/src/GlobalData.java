import java.util.ArrayList;

public class GlobalData {

GlobalData(){
	
}
	
	private int rows;
	private int columns;
	private int droneMaxLoad;
	private int turnsCount;
	private int productTypeCount;
	
	private int warehousesCount;
	public ArrayList<Warehouse> warehouseList;
	
	private int droneCount; 
	public ArrayList<Drone> dronesList;
	
	private int ordersCount;
	public ArrayList<Order> orderList;
	

	public int getRows(){
		return rows;
	}
	
	public int getMaxLoad(){
		return droneMaxLoad;
	}
	
	public int getTurns(){
		return turnsCount;
	}
	
	public int getColumns(){
		return columns;
	}	
	
	public int getWarehouseCount(){
		return warehousesCount;
	}
	
	public int getDroneCount(){
		return droneCount;
	}
	
	public int getOrdersCount(){
		return ordersCount;
	}
	
	public int getProductTypeCount(){
		return productTypeCount;
	}
	
	public void serRows(int r){
		this.rows=r;
	}
	
	public void setMaxLoad(int m){
		this.droneMaxLoad=m;
	}
	
	public void setColumns(int c){
		this.columns=c;
	}	
	
	public void setTurns(int t){
		this.turnsCount=t;
	}
	
	public void setWarehouses(int w){
		this.warehousesCount=w;
	}
	
	public void setDroneCount(int c){
		this.droneCount=c;
	}
	
	public void setOrdersCount(int o){
		this.ordersCount=0;
	}
	
	public void setProductTypeCount(int p){
		this.productTypeCount=p;
	}
	
}
