package edu.escuelaing.arep.parcial.servicesImpl;

import edu.escuelaing.arep.parcial.model.DataConnection;
import edu.escuelaing.arep.parcial.servicesConnection.ServicesConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
public class ConnectionImpl implements ServicesConnection {
	
	@Override
	 public Object getDataWeatherForPlace(DataConnection conexionNueva) throws Exception {
	       
		URL url = new URL(conexionNueva.getUrl()+conexionNueva.getOperacion()+"-"+conexionNueva.getNumero());
		  HttpURLConnection con = (HttpURLConnection) url.openConnection();
	        con.setDoOutput(true);
	        StringBuilder response;
	        try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
	            response = new StringBuilder();
	            String responseLine;
	            while ((responseLine = br.readLine()) != null) {
	                response.append(responseLine.trim());
	            }
	        }
	        return response;
	    }
}
