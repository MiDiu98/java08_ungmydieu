package common;

public enum CirclePosition {
	INSIDE("Trong đường tròn"), 
	ONSIDE("Trên đường tròn"), 
	OUTSIZE("Ngoài đường tròn");
	
	public String value;
	
	CirclePosition(String value){	
		this.value = value;
	}	
}
