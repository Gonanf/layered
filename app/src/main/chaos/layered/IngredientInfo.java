package app.src.main.chaos.layered;

public class IngredientInfo {
	public String name;
	public int quantity;

	// @ConstructorParameters({"name","quantity"})
	public IngredientInfo(String cname,int cquantity){
	name = cname;
	quantity = cquantity;
	}
}
