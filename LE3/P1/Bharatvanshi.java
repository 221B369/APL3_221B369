abstract class Bharatvanshi
{
	String name;
	public Bharatvanshi(String name)
	{
		this.name = name;
	}
	public void fight()
	{
		System.out.println(name + " is a fighter.");
	}
	abstract void obey();
	abstract void kind();
}
