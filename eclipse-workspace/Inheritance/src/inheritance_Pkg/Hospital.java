package inheritance_Pkg;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Surgeon s = new Surgeon();
		  s.Doctor_Details();
		  s.Surgeon_Details();

	}
	
}

	
	class Doctor {
		 void Doctor_Details() {
		  System.out.println("Doctor Details...");
		 }
		}

		class Surgeon extends Doctor {
		 void Surgeon_Details() {
		  System.out.println("Surgen Detail...");
		 }
		 
		}

		

