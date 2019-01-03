package room;

public class Couch {

	private String rozmiarXYZ;
	private String color;
	
	
	public Couch(String rozmiarXYZ, String color) {
		super();
		this.rozmiarXYZ = rozmiarXYZ;
		this.color = color;
	}


	public String getRozmiarXYZ() {
		return rozmiarXYZ;
	}


	public String getColor() {
		return color;
	}


	public String getCouch() {
				
		return "couch with dimentions: "+rozmiarXYZ+" color: "+color;
	}
	
	
	

	
	
	
	
	
	
}
