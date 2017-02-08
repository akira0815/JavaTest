
public class Hospital {

	public static void main(String[] args) {

		DoctorModel model = new DoctorModel("iPad", "���ð�");

		// Doctor kim = new Doctor(model);
		// kim.inquery();
		// kim.treatment();
		// kim.prescription();

		Doctor[] doctors = new Doctor[3];
		doctors[0] = new Doctor(new DoctorModel("�����е�1", "���ð�1"));
		doctors[1] = new Doctor(new DoctorModel("�����е�2", "���ð�2"));
		doctors[2] = new Doctor(new DoctorModel("�����е�3", "���ð�3"));

		for (int i = 0; i < doctors.length; i++) {
			doctors[i].inquery();
			doctors[i].treatment();
			doctors[i].prescription();
		}
		
		System.out.println("========================================");

		for (Doctor doctor : doctors) {
			doctor.inquery();
			doctor.treatment();
			doctor.prescription();
		}

		// doctors[1].inquery();
		// doctors[1].treatment();
		// doctors[1].prescription();
	}

}
