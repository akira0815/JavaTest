
public class Hospital {

	public static void main(String[] args) {
		Doctor kim = new Doctor();
		kim.setComputer("MRI");
		kim.inquery();
		kim.treatment();
		
		Doctor bong = new Doctor();
		bong.treatment();
		bong.prescription();
	}
	
}
