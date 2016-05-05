package test2;

public class question2 {
	private int year;
	private String make = null;
	private String model = null;
	private int numberOfGear;
	private String color = null;
	private String name = null;
	private static int currentGear;
	
	public question2(int year, String make, String model, int numberOfGear, String color, String name)
	{
		this.year = year;
		this.make = make;
		this.model = model;
		this.numberOfGear = numberOfGear;
		this.color = color;
		this.name = name;
	}
	public void Setyear (int y)
	{
		year = year;
	}
	public void SetName(String name)
	{
		name = name;
	}
	public void SetModel(String model)
	{
		model = model;
	}
	public void SetNumberOfGear(int numberOfGear)
	{
		numberOfGear = numberOfGear;
	}
	public void SetMake(String make)
	{
		make = make;
	}
	public static void SetGeat(int gear)
	{
		++currentGear;
	}
	public int GetSpeed()
	{
		int maxSpeed = 0;
		if(currentGear == 1)
			maxSpeed = 10;
		else if(currentGear == 2)
			maxSpeed = 20;
		else if(currentGear == 3)
			maxSpeed = 30;
		else if(currentGear == 4)
			maxSpeed = 40;
		else if(currentGear == 5)
			maxSpeed = 50;
		else if(currentGear == 6)
			maxSpeed = 60;
		
		return maxSpeed;
	}
	
}
