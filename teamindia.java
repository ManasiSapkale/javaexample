class teamindia extends msdhoni
{

	public static void main(String args[])
	{
		teamindia ti=new teamindia();
		ti.trophies();
	}
	
	public void trophies()
	{
		System.out.println(super.trophies);
	}

}
class msdhoni
{
	String trophies="ICC world cup, championship cup, t20 world cup";
}