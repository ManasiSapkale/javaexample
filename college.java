//interface example
class college implements library{
	
	public static void main(String args[])
	{	
		college cl=new college();
		cl.scifibooks();
		cl.fictionbooks();
		System.out.println(cl.i);
	}
	@Override
	public void scifibooks()
	{
		System.out.println("Scifi Books");
	}
	@Override
	public void fictionbooks()
	{
		System.out.println("Fiction Books");
	}
}
interface library{
	int i=10;
	void scifibooks();
	void fictionbooks();
}