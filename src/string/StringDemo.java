package string;

class MyNumbers {
	Integer i;
	String s;

	public MyNumbers(Integer i, String s) {
		this.i = i;
		this.s = s;
	}

	/*
	 * @Override public int compareTo(MyNumbers o) { if (this.i < o.i) { return
	 * -1; } else return 1; }
	 */

	@Override
	public String toString() {
		return "MyNumbers [i=" + i + ", s=" + s + "]";
	}

}
public class StringDemo {

	public static void main(String[] args) {

		String s = "sams";
		long count = s.chars().filter(i -> i == 's').count();
		System.out.println(count);

		/*
		 * Comparator<MyNumbers> com = new Comparator<MyNumbers>() {
		 * 
		 * @Override public int compare(MyNumbers o1, MyNumbers o2) { { if (o1.i
		 * < o2.i) { return -1; } else return 1; } } }; List<MyNumbers> ls = new
		 * ArrayList<>(); ls.add(new MyNumbers(10, "hey")); ls.add(new
		 * MyNumbers(5, "hello")); ls.add(new MyNumbers(18, "woow"));
		 * Collections.sort(ls, com); System.out.println(ls);
		 */


		/*
		 * String str = "a"; String a = "ab";
		 * System.out.println(str.compareTo(a));
		 */
		// INt
		// Collections.sort(list);

		/*
		 * System.out.println(System.identityHashCode(a));
		 * 
		 * System.out.println(System.identityHashCode(str)); String st = new
		 * String("hey"); System.out.println(System.identityHashCode(st));
		 * 
		 * System.out.println(str == st.intern());
		 */

	}

}
