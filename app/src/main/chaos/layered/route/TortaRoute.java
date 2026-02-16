package app.src.main.chaos.layered.route;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import app.src.main.chaos.layered.view.TortaViewInterface;

public class TortaRoute implements HttpHandler {
	private TortaViewInterface torta_view;

	public TortaRoute(TortaViewInterface torta_view){
		this.torta_view = torta_view;
	}

	@Override
	public void handle(HttpExchange exchange) throws IOException{
		String[] path = exchange.getRequestURI().getPath().split("/");
		if (path.length < 3){
			String error_msg = "You need an ID";
			exchange.getResponseHeaders().set("Content-Type","text/plain");
			exchange.sendResponseHeaders(404,error_msg.getBytes().length);

			OutputStream file = exchange.getResponseBody();
			file.write(error_msg.getBytes());
			file.close();
		}

		String body = "<DOCTYPE html> <html><head><title>tortas</title></head><body><table>"+this.torta_view.renderByID(Integer.parseInt(path[2]))+"</table></body></html>";

		exchange.getResponseHeaders().set("Content-Type","text/html");
		exchange.sendResponseHeaders(200,body.getBytes().length);

		OutputStream file = exchange.getResponseBody();
		file.write(body.getBytes());
		file.close();
	}
}
