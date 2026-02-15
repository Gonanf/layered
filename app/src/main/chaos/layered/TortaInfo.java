package app.src.main.chaos.layered;
import app.src.main.chaos.layered.IngredientInfo;


public class TortaInfo {
	IngredientInfo ingredients[];
	String name;
	float price;

	// @ContructorParameters({"name","price","ingredients"})
	public TortaInfo(String name,float price, IngredientInfo[] ingredients){
		name = name;
		price = price;
		ingredients = ingredients;
	}
}
