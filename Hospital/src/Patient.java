
public class Patient {
	
	private PatientModel model;
	
	public Patient(PatientModel model){
		this.model = model;
	}
	
	public int talkAge(){
		return model.getAge();
	}
	
	public String talkName(){
		return model.getName();
	}

	public String talkTroubleType(){
		return model.getTroubleType();
	}
}
