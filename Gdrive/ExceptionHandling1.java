package Gdrive;

public class ExceptionHandling1 {


		public static void main(String[] args) {
      
				int result= divide(3,0);
				System.out.println("Result: "+result);

			}

			private static int divide(int i, int j) {
				int result=0;
				try {
					result= i/j;
				} catch (ArithmeticException e) {
					e.printStackTrace();
					System.out.println("Exception Occurred by dividing with number:"+j);
				}
				return result;
			}

		}


