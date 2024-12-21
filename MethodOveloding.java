package JavaSession;

public class MethodOveloding {
     int a=10,b=20;
     void sum()
     {
    	 System.out.println(a+b); 
     }
     void sum(int x, int y)
     {
    	 System.out.println(x+y);
     }
     void sum(int x, double y)
     {
    	 System.out.println(x+y);
     }
     void sum(double x, int y)
     {
    	 System.out.println(x+y);
    	 
     }
     void sum(int a, int b, int c)
     {
    	 System.out.println(a+b+c);
     }
     
	public static void main(String[] args) {
		MethodOveloding m1=new MethodOveloding();
		m1.sum();
        m1.sum(20.5, 200);
        m1.sum(20, 10.5);
        m1.sum(100, 300);
        m1.sum(20, 90, 300);
	}

}
