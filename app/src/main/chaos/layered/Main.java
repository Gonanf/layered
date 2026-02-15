package app.src.main.chaos.layered;
import app.src.main.chaos.layered.HomeView;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;


public class Main {
	//Constructor (?); It exists as is in every class 
	public static void main() throws IOException{
		HttpServer web = HttpServer.create(new InetSocketAddress(8080), 0);
		web.createContext("/", new HomeView());

		System.out.println("Amoga");
		web.start();
	}
}
