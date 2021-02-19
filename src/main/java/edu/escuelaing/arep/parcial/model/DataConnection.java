package edu.escuelaing.arep.parcial.model;

public class DataConnection {

    private String url = null;
    private String operacion = null;
    private String numero=null;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public DataConnection(String url, String operacion,String numero) {
		super();
		this.url = url;
		this.operacion = operacion;
		this.numero=numero;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
}
