package app.src.main.chaos.layered.view;
import app.src.main.chaos.layered.models.TortaInfo;

public interface TortaViewInterface {
	public String renderObject(TortaInfo torta);
	public String renderByID(int id);
	public String renderAll();
}
