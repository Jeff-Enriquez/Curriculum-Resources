package a.b.c.d.e;

public class Moon extends Planet{
	
	public String myPlanet; 
	
	public Moon() {
		super(); // This is a way of calling our parent constructor. 
	}
	
	public Moon(String name, boolean rings, double mass, String myPlanet) {
		super(name,rings,mass);
		
		this.myPlanet = myPlanet;
	}
	
	public void crash(String planet, String myPlanet) {
		System.out.println("Kaboom " + planet + " " + myPlanet + " " + this.myPlanet);
	}

}
