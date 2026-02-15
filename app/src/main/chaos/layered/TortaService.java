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
		TortaInfo[] tortas = new TortaInfo[]
		{
			new TortaInfo(
					new String("amoga"),
					1000,
					new IngredientInfo[]
					{
						new IngredientInfo(new String("aguas"),200)
					}
				     )
		};
		System.out.println(tortas[0].name);
		return tortas;
	}
	public static TortaInfo[] getByName(String name){
		return new TortaInfo[5];
	}
}
