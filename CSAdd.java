
public class CSAdd implements Runnable {

		int variableInCS; 
		
		 public CSAdd(int VariableInCS) {
			
			 this.variableInCS = variableInCS;
		}

		@Override
		public void run() {
			
			for (int i = 0; i < 4; i++) {
				variableInCS++;
			}
			
			
		}
}
