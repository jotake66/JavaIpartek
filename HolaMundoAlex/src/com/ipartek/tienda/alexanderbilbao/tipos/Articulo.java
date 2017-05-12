package com.ipartek.tienda.alexanderbilbao.tipos;

public class Articulo {
	private String nombre, descripcion;
	private int idarticulo, iprecio;

	// ************** generar la HashMap ********************************
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + idarticulo;
		result = prime * result + iprecio;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;

		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idarticulo != other.idarticulo)
			return false;
		if (iprecio != other.iprecio)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// ******* generar el constructor ***************
	public Articulo() {
		super();
	}

	// ***** generar getters y setters ***************
	public Articulo(int idarticulo, String nombre, String descripcion, int precio) {
		super();
		this.idarticulo = idarticulo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.iprecio = precio;
	}

	public Articulo(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", descripcion=" + descripcion + ", idarticulo=" + idarticulo + ", iprecio=" + iprecio + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdarticulo() {
		return idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public int getIprecio() {
		return iprecio;
	}

	public void setIprecio(int iprecio) {
		this.iprecio = iprecio;
	}

	public static boolean containsKey(String nombre2) {
		// TODO Auto-generated method stub
		return false;
	}

}
