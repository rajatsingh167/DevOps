interface Maths
{
	int operation(int a,int b);
}
public class LambdaTest {

	public static void main(String[] args) {
		Maths m =new Maths(){

			@Override
			public int operation(int a, int b) {
				
				return a+b;
			}
			
		};
		
		System.out.println(m.operation(2, 4));
		
		Maths m1=(int a,int b)->{
			return a+b;
		};
		
		
		System.out.println(m1.operation(5, 5));
		
		
		Maths m2=(a,b)->{
			return a+b;
		};
		
		
		System.out.println(m2.operation(15, 15));
		
		Maths m3=(a,b)->a+b;
		

	}

}
