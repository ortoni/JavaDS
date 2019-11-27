package all;

public class Check {
	public static void main(String[] args) {
		String[] a = {"b", "a","c"};
		for (int i = 0; i <= a.length; i++) {
			if(a[i].equals("a")) {
				break;
			}else {
				System.out.println(a[i]);
			}
			
		}		
		

	}
}
