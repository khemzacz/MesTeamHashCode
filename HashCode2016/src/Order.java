import java.util.ArrayList;

public class Order {
	
	Order(Coordinates target){
		this.target = new Coordinates(target.getr(),target.getc());
		this.products = new ArrayList<Product>();
		this.state = OrderState.PENDING;
	}
	
	
	
	
//	public void addProduct(Product product){
//		this.products.add(product);
//	}

	
	public ArrayList<Product> products;
	
	
	
	private OrderState state;
	private Coordinates target;
	
}

