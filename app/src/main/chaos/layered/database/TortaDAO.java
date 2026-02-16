package app.src.main.chaos.layered.database;
import app.src.main.chaos.layered.database.TortaDAOInterface;
import app.src.main.chaos.layered.models.TortaInfo;
import app.src.main.chaos.layered.models.IngredientInfo;

public class TortaDAO implements TortaDAOInterface {
	
	@Override
	public TortaInfo getByID(int id){
		return new TortaInfo("amoga",200,new IngredientInfo[]{new IngredientInfo("Agua",20)});
	}

	@Override
	public TortaInfo[] getAll(){
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

		return tortas;
	}
	
	@Override
	public TortaInfo[] getByName(String name){
		return new TortaInfo[5];
	}
}


