package FAQLogical;

public class Lab9 {

	public static void main(String[] args) {
		String s="Neeraj Kumar Pandey";
		String[] s1=s.split("");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]);
			System.out.print("  ");
		}
		System.out.println("\n rev started form here");
		for (int i = s1.length-1; i >= 0; i--) {
			System.out.print(s1[i]);
			System.out.print("   ");
		}
	}

}
