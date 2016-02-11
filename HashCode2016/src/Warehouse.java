import java.util.LinkedList;

public class Warehouse {

	private int ID;
	private Coordinates cord;
	private LinkedList<Integer> availableProducts;


	Warehouse(Coordinates cord, int ID){
		this.cord = new Coordinates(cord.getr(),cord.getc());
		this.ID = ID;

		availableProducts = new LinkedList<>();
		for (int i=0; i < GlobalData.productTypeSize; ++i)
			availableProducts.add(0);
	}

	public Coordinates getCord() {
		return cord;
	}

	public void setCord(Coordinates cord) {
		this.cord = cord;
	}

	public LinkedList<Integer> getAvailableProducts() {
		return availableProducts;
	}

	public void setAvailableProducts(LinkedList<Integer> availableProducts) {
		this.availableProducts = availableProducts;
	}

	public void setAvailableProductType(int count, int productType){
		this.availableProducts.set(productType, count);
	}

	public int getID(){
		return ID;
	}

	public void setID(int id){
		this.ID=id;
	}



}
