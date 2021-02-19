package edu.escuelaing.arep.parcial.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class Cliente {
	

	public static void main(String[] args) throws IOException {
		

		URL miFachada = new URL("https://calm-cliffs-88878.herokuapp.com/index?calcular=sen-3.1415");

		URLConnection conexion = miFachada.openConnection();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
		BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
		
		String read;
		JSONObject conversion = new JSONObject();

		while ((read = entrada.readLine()) != null) {
			String res = read.replace("{\"El resultado es\":", "").replace("}", "");
			conversion.put("El resultado es", res);
		}
		System.out.println(conversion);
		entrada.close();
		ent.close();
	}


}
