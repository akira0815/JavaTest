
public class Doctor {
	
	private String computer = "����ý���";
	private String medicalAppliance = "û����";
	
	public void setComputer(String computer) {
		this.computer = computer;
	}
	
	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}
	
	public void inquery() {
		System.out.println(computer + "���� " + "ȯ���� íƮ�� ��ȸ�մϴ�.");
	}

	public void treatment() {
		System.out.println(medicalAppliance + "�� " + "ȯ�ڸ� �����մϴ�.");
	}
	
	public void prescription() {
		System.out.println("ó������ �ۼ��մϴ�.");
	}
}
