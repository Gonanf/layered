package app.src.main.chaos.layered;
import app.src.main.chaos.layered.TortaInfo;
import app.src.main.chaos.layered.IngredientInfo;
//ORM
//Connect with a database
public class TortaService {
	public static TortaInfo getByID(int id){
		return new TortaInfo("amogo",300,new IngredientInfo[0]);
	}
	public static TortaInfo[] getAll(){ 
		return new TortaInfo[]
		{
			new TortaInfo(
					"amoga",
					1000,
					new IngredientInfo[]
					{
						new IngredientInfo("aguas",200)
					}
				     )
		};
	}
	public static TortaInfo[] getByName(String name){
		return new TortaInfo[5];
	}
}
