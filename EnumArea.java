package br.com.projetobancoddos2;

public enum EnumArea {
 SI("SISTEMAS INTELIGENTES"),Geo("georeferencia");
		public String area;
		EnumArea(String tipo){
			this.area=tipo;
		}
		public String valor() {
			return area;
		}
}
