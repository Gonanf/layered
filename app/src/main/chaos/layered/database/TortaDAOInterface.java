package app.src.main.chaos.layered.database;
import app.src.main.chaos.layered.models.TortaInfo;

public interface TortaDAOInterface {
	public TortaInfo getByID(int id);
	public TortaInfo[] getAll();
	public TortaInfo[] getByName(String name);
}
