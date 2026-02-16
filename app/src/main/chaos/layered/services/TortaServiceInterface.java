package app.src.main.chaos.layered.services;
import app.src.main.chaos.layered.models.*;

public interface TortaServiceInterface {
	public TortaInfo getByID(int id);
	public TortaInfo[] getAll();
	public TortaInfo[] getByName(String name);
}
