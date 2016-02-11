import java.util.ArrayList;

public class Order {
	
	Order(Coordinates target){
		this.target = new Coordinates(target.getr(),target.getc());
		this.products = new ArrayList<Product>();
		this.state = OrderState.PENDING;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public Coordinates getTarget() {
		return target;
	}

	public void setTarget(Coordinates target) {
		this.target = target;
	}

	//	public void addProduct(Product product){
//		this.products.add(product);
//	}

	
	public ArrayList<Product> products;
	
	
	
	private OrderState state;
	private Coordinates target;
	
}

