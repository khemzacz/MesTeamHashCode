
public class Product {

Product(int ID, int weight){
	setID(ID);
	setWeight(weight);
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

private int weight;
private int ID;
}
