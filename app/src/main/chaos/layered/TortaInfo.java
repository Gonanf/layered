package app.src.main.chaos.layered;
import app.src.main.chaos.layered.IngredientInfo;


public class TortaInfo {
	public IngredientInfo ingredients[];
	public String name;
	public float price;

	// @ContructorParameters({"name","price","ingredients"})
	public TortaInfo(String cname,float cprice, IngredientInfo[] cingredients){
		name = cname;
		price = cprice;
		ingredients = cingredients;
	}
}
