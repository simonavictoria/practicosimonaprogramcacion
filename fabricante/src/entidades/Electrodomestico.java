package entidades;

import fabricante.Fabricante;

public class Electrodomestico {

	public Fabricante fabricante;
	protected String modelo;
	protected Double precio;
	protected Integer stock;
	
	
	public Electrodomestico() {
		// TODO Auto-generated constructor stub
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
}
