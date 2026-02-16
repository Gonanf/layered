package app.src.main.chaos.layered.services;
import app.src.main.chaos.layered.models.TortaInfo;
import app.src.main.chaos.layered.services.TortaServiceInterface;
import app.src.main.chaos.layered.database.*;


public class TortaService implements TortaServiceInterface{
	private TortaDAOInterface torta_database;


	public TortaService(TortaDAOInterface torta_database){
		this.torta_database = torta_database;
		// this.ingredient_database = ingredient_database;
	}

	@Override
	public TortaInfo getByID(int id){
		return this.torta_database.getByID(id);
	}

	@Override
	public TortaInfo[] getAll(){ 
		return this.torta_database.getAll();
	}

	@Override
	public TortaInfo[] getByName(String name){
		return this.torta_database.getByName(name);
	}
}
