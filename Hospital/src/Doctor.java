
public class Doctor {

	private DoctorModel model;
	
	public Doctor(DoctorModel model) {
		this.model = model;
	}
	
	public void inquery() {
		System.out.println(String.format("%s ���� ȯ���� íƮ�� ��ȸ�մϴ�.", model.getComputer()));
	}

	public void treatment() {
		System.out.println(String.format("%s (��)�� ȯ�ڸ� �����մϴ�.", model.getMedicalAppliance()));
	}

	public void prescription() {		
		System.out.println(String.format("%s (��)�� ó������ �ۼ��մϴ�.", model.getComputer()));
	}
}
