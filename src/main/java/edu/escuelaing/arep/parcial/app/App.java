package edu.escuelaing.arep.parcial.app;
import static spark.Spark.*;

import org.json.JSONObject;

import spark.Request;
import spark.Response;


import static spark.Spark.get;
import static spark.Spark.port;
import edu.escuelaing.arep.parcial.model.*;
import edu.escuelaing.arep.parcial.servicesConnection.ServicesConnection;
import edu.escuelaing.arep.parcial.servicesImpl.ConnectionImpl;

public class App {
	
 
	 public static void main(String args[]){
	        port(getPort());
	        get("/index",(req,res) -> inputDataPage(req,res));
	        
	    }
		private static Object   inputDataPage(Request req, Response res) {
			Object   resultado = connection(req, res);

			return resultado;
		}

		public static Object   connection(Request req, Response res) {
		    String[] listaNormal= req.queryParams("calcular").split("-");
		    ServicesConnection connectionService = new ConnectionImpl();
			String calcular = listaNormal[0];
			Object resultado = null;
			DataConnection conexionNueva=new DataConnection("https://morning-beach-49926.herokuapp.com/index?calcular="
		    		,calcular,listaNormal[1]);
			try {
				resultado=connectionService.getDataWeatherForPlace(conexionNueva);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			res.header("Content-Type", "application/json");
			return resultado;
		}

    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}