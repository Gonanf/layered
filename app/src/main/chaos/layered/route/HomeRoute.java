package app.src.main.chaos.layered.route;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import app.src.main.chaos.layered.view.TortaViewInterface;

public class HomeRoute implements HttpHandler {
	private TortaViewInterface torta_view;

	public HomeRoute(TortaViewInterface torta_view){
		this.torta_view = torta_view;
	}

	public String render(){
			return new String("<!DOCTYPE html><html><head><title>amoga</title></head><body><h1>Inicio</h1>" + torta_view.renderAll() +  "</body></html>");
		}

	@Override
	public void handle(HttpExchange exchange) throws IOException{
		String body = this.render();

		exchange.getResponseHeaders().set("Content-Type","text/html");
		exchange.sendResponseHeaders(200,body.getBytes().length);
	
		OutputStream file = exchange.getResponseBody();
		file.write(body.getBytes());
		file.close();
	}
}
