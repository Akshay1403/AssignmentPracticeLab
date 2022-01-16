abstract class InnerClass 
{
	 public abstract void display();
}
	public class InnerClass {
		
	   public static void main(String[] args) {
		   
	    InnerClass i = new InnerClass() {
	    public void display() {
	    	
	    System.out.println("This is an Anonymous Inner Class");
	   }
	 };
	 
	   i.display();
	 }
}