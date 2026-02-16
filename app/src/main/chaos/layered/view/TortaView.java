package app.src.main.chaos.layered.view;
import app.src.main.chaos.layered.models.TortaInfo;
import app.src.main.chaos.layered.services.TortaServiceInterface;
import app.src.main.chaos.layered.models.IngredientInfo;
import app.src.main.chaos.layered.view.TortaViewInterface;


//Render HTML
public class TortaView implements TortaViewInterface {
	private TortaServiceInterface service;

	public TortaView(TortaServiceInterface service){
		this.service = service;
	}

	@Override
	public String renderObject(TortaInfo torta){
			String response = "<tr><td><a href='/torta/"+torta.id+"'>"+torta.name+"</a></td><td>"+torta.price+"</td><td>";
		for (IngredientInfo ingredient : torta.ingredients) {
				response += "- " + ingredient.name + " (" + ingredient.quantity + "u)<br/>";
				}

		return response + "</td></tr>";
	}
	
	@Override
	public String renderByID(int id) {
		return this.renderObject(this.service.getByID(id));
	}

	@Override
	public String renderAll(){
		String response = new String("<table><tr><td>Nombre</td><td>Precio</td><td>Ingredientes</td></tr>");
		TortaInfo[] tortas = this.service.getAll();
		System.out.println(response);
		for(TortaInfo torta : tortas)
		{
			response += this.renderObject(torta);
		}

		return response + "</table>";

	}
}
