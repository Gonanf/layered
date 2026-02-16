package app.src.main.chaos.layered.models;
import app.src.main.chaos.layered.models.IngredientInfo;


public class TortaInfo {
	public int id;
	public IngredientInfo ingredients[];
	public String name;
	public float price;

	// @ConstructorParameters({"name","price","ingredients"})
	public TortaInfo(String name,float price, IngredientInfo[] ingredients){
		this.name = name;
		this.price = price;
		this.ingredients = ingredients;
	}

	// public IngredientInfo[] getIngredients(){
	// 	return ingredients;
	// }
	//
	// public String getName(){
	// 	return name;
	// }
	//
	// public float getPrice
}
