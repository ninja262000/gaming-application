package miniprojectgame;

public class Main 
{

	public static void main(String[] args) 
	{
		Player1 p1=new Player1("Praisy","LMG",80);
		System.out.println(p1.getname());
		System.out.println(p1.getweapon());
		System.out.println(p1.gethealth());
		
		p1.damagebyGun1();
		p1.damagebyGun2();
		
		/*Player2 p2=new Player2("kunal","machine gun",90,false);
		p2.damagebyGun1();
		p2.damagebyGun2();*/
	}

}
