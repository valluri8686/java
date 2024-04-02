import java.util.Scanner;
class XPowerN
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the base number : ");
		int x=scan.nextInt();
		System.out.println("Enter the power value : ");
		int n = scan.nextInt();
		int pro=1;
		for(int i=1;i<=n;i++){
			pro= pro*x;
		}
		System.out.println("the result value is "+ pro);
		
	}
}
