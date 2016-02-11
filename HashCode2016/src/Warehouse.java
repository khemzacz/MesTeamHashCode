
public class Warehouse {

Warehouse(Coordinates cord, int ID){
	this.cord = new Coordinates(cord.getr(),cord.getc());
	setID(ID);
}




public int getID(){
	return ID;
}

public void setID(int id){
	this.ID=id;
}



private int ID;	
private Coordinates cord;
}
