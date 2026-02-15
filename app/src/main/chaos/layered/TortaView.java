package app.src.main.chaos.layered;
import app.src.main.chaos.layered.TortaInfo;
import app.src.main.chaos.layered.TortaService;
import app.src.main.chaos.layered.IngredientInfo;

//Render HTML
public class TortaView {
	public static String renderByID(int id) {

		return new String("TODO:");
	}
	public static String renderAll(){
		String response = new String("<table><tr><td>Nombre</td><td>Precio</td><td>Ingredientes</td></tr>");
		TortaInfo[] tortas = TortaService.getAll();
		System.out.println(response);
		for(TortaInfo torta : tortas)
		{
			System.out.println("Torta: " + torta.name);

			response += "<tr><td>"+torta.name+"</td><td>"+torta.price+"</td><td>";
				for (IngredientInfo ingredient : torta.ingredients) {
				response += "- " + ingredient.name + " (" + ingredient.quantity + "u)<br/>";
				}
			response += "</td></tr></table>";
		}
		return response;

	}
}
