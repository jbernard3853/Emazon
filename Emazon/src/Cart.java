/**
 * By: Jaron Huang and Kelvin Chen
 */
import java.util.ArrayList;


public class Cart {

	ArrayList<Items> cart = new ArrayList<Items>();
	
	public String getItems()
	{
		String cartList = "You have";
		for(int x = 0; x < cart.size();x++)
		{
			cartList.concat(cart.get(x).getName());
		}  
		
		return cartList;
	}
	public void addItem(Items x)
	{
		CSVUtilities.writeCSV(x.getName(), x.getQuantity(), x.getPrice(), x.getImage() );
	}
}
