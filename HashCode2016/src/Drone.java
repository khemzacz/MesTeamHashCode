import java.util.ArrayList;

public class Drone {
	Drone(int maximum_weight){
		this.state = DroneState.READY;
		this.maxweight=maximum_weight;
	}
		
	
	DroneState state;
	public boolean checkWeight(Product product)
	{
		int weight=0;
		for (int i=0; i<load.size();i++)
		{
			weight+=load.get(i).getWeight();	
		}
		weight+=product.getWeight();
		if(weight<maxweight)
			return true;
		else
			return false;
		
	}
	
	public int getID(){
		return ID;
	}

	public void setID(int id){
		this.ID=id;
	}
	
	private int ID;
	private int maxweight;
	ArrayList<Product> load;
}
