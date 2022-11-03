public class CSSub implements Runnable {

		int variableInCS; 
		
		 public CSSub(int VariableInCS) {
			
			 this.variableInCS = variableInCS;
		}

		@Override
		public void run() {
			
			for (int i = 0; i < 4; i++) {
				variableInCS++;
			}
			
			
		}
}
