
public class Doctor {
	
	private String computer = "전산시스템";
	private String medicalAppliance = "청진기";
	
	public void setComputer(String computer) {
		this.computer = computer;
	}
	
	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}
	
	public void inquery() {
		System.out.println(computer + "에서 " + "환자의 챠트를 조회합니다.");
	}

	public void treatment() {
		System.out.println(medicalAppliance + "로 " + "환자를 진료합니다.");
	}
	
	public void prescription() {
		System.out.println("처방전을 작성합니다.");
	}
}
