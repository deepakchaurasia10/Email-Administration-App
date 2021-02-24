package emailApp;

public class emailApp {

	public static void main(String[] args) {
		//Email mail = new Email("Deepak", "Chaurasia");
		System.out.println();
		//System.out.println(mail.showInfo());
		String st = "1234567890";
		char [] arr = new char[st.length()];
		
		for(int i = 0; i < 8; i++) {
		int rand1 = (int) (Math.random() * st.length());
		arr[i]= st.charAt(rand1);
		System.out.print(arr[i]);
		}
		
	}

}
