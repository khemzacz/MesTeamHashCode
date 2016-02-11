
public class Product {

Product(int ID, int weight){
	setID(ID);
	setWeight(weight);
	this.state = ProductState.UNDELIVERED;
}
Product(Product p){
	setID(p.getID());
	setWeight(p.getWeight());
	this.state = p.state;
}

	
public void setWeight(int weight){
	this.weight=weight;
}
public int getWeight(){
	return weight;
}

public int getID(){
	return ID;
}

public void setID(int id){
	this.ID=id;
}


public ProductState state;
private int weight;
private int ID;
}
