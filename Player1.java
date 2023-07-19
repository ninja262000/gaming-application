package miniprojectgame;

public class Player1  
{
	private String name;
	private String weapon;
	private int health;
	
	public Player1(String name, String weapon, int health)
	{
		this.name=name;
		this.weapon=weapon;
		if(this.health<0 || health>100)
		{
			this.health=100;
		}else this.health=health;
	}
	
	public void damagebyGun1()
	{
		this.health-=30;
		if(this.health<=0)
		{
			this.health=0;
		}
		System.out.println("Got hit by gun 1. Health is reduced by 30."+
							 "New health is "+this.health);
		System.out.println();
		if(this.health==0)
		{
			System.out.println(getname()+" is Dead");
		}
	}
	
	public void damagebyGun2()
	{
		this.health-=50;
		if(this.health<=0)
		{
			this.health=0;
		}
		System.out.println("Got hit by gun 2. Health is reduced by 50."+
							"New health is "+this.health);
		System.out.println();
		if(this.health==0)
		{
			System.out.println(getname()+" is Dead");
		}
	}
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getweapon()
	{
		return weapon;
	}
	public void setweapon(String weapon)
	{
		this.weapon=weapon;
	}
	public int gethealth()
	{
		return health;
	}
	public void sethealth(int health)
	{
		this.health=health;
	}
}
