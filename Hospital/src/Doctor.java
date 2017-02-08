
public class Doctor {

	private DoctorModel model;
	
	public Doctor(DoctorModel model) {
		this.model = model;
	}
	
	public void inquery() {
		System.out.println(String.format("%s 에서 환자의 챠트를 조회합니다.", model.getComputer()));
	}

	public void treatment() {
		System.out.println(String.format("%s (으)로 환자를 진료합니다.", model.getMedicalAppliance()));
	}

	public void prescription() {		
		System.out.println(String.format("%s (으)로 처방전을 작성합니다.", model.getComputer()));
	}
}
