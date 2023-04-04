//interface for multiple inheritance

public class perfume implements fog,uspolo
{
	public static void main(String args[])
	{
		//object creation
		perfume per=new perfume();
		per.dynamic();
		per.madrid6();
	}
	//method overriding for fog
	@Override
	public void dynamic()
	{
		System.out.println("Fog Dynamic");
	}
	//method overriding for uspolo
	@Override
	public void madrid6()
	{
		System.out.println("Us Polo Madrid 6");
	}
}
interface fog{
	void dynamic();
}
interface uspolo{
	void madrid6();
}