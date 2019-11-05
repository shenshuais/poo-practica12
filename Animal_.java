package ejercicio2;
public class Animal_ {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	public Animal_ (String speciesName, boolean hopper, boolean swimmer){
		species = speciesName;
		this.canHop = hopper;
		this.canSwim = swimmer;
	}
	public boolean canHop(){ return canHop; }
	public boolean canSwim(){ return canSwim; }
	public String toString(){ return species; }
}

