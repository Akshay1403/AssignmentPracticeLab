
public class AccessModifiers {
public int w = 100;
private int x=200;
int y = 300;
protected int z = 400;
void show()
{
	System.out.println("Public W ="+w);
	System.out.println("Private x"+x);
	System.out.println("Default y = "+y);
	System.out.println("protected z = "+z);
}
class AccessModifiers1
{
	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
		access.show();
	}
}
}

