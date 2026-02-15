package app.src.main.chaos.layered;
import app.src.main.chaos.layered.IngredientInfo;


public class TortaInfo {
	private:
	IngredientInfo ingredients[];
	String name;
	float price;

	public:
	@ContructorParameters({"name","price","ingredients"})
	TortaInfo(String name,float price, IngredientInfo[] ingredients){
		name = name;
		price = price;
		ingredients = ingredients;
	}
}
