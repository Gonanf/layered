package app.src.main.chaos.layered;
import app.src.main.chaos.layered.view.*;
import app.src.main.chaos.layered.route.*;
import app.src.main.chaos.layered.services.TortaService;
import app.src.main.chaos.layered.database.TortaDAOPlaceholder;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

//TODO: Create an API layer
public class Main {
	//Constructor (?); It exists as is in every class 
	public static void main() throws IOException{
		HttpServer web = HttpServer.create(new InetSocketAddress(8080), 0);
		
		TortaView torta_view = new TortaView(
					new TortaService(
						new TortaDAOPlaceholder()
						)
			
					);

		web.createContext("/", new HomeRoute(torta_view));
		web.createContext("/torta/", new TortaRoute(torta_view));

		System.out.println("Amoga");
		web.start();
	}
}
