package app.src.main.chaos.layered;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import app.src.main.chaos.layered.TortaView;


public class HomeView implements HttpHandler {
	@Override
	public void handle(HttpExchange exchange) throws IOException{
		String body = new String("<!DOCTYPE html><html><head><title>amoga</title></head><body><h1>Inicio</h1>" + TortaView.renderAll() +  "</body></html>");

		exchange.getResponseHeaders().set("Content-Type","text/html");
		exchange.sendResponseHeaders(200,body.getBytes().length);
	
		OutputStream file = exchange.getResponseBody();
		file.write(body.getBytes());
		file.close();
	}
}
