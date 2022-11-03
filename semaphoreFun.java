
public class semaphoreFun {

	public static void main(String[] args) {
		
		int CSvariable = 1; 

		CSSub one = new CSSub(CSvariable);
		CSAdd two = new CSAdd(CSvariable);

		Thread thread1 = new Thread(one);
		Thread thread2 = new Thread(two);
		
		thread1.start();
		thread2.start();
		
		System.out.println(CSvariable);
	}

}
