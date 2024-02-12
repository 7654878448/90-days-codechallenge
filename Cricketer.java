package collectionFramework;

public class Cricketer {
	private int jn;
	private String name;
	private String adress;
	private int salery;
	


public Cricketer(int jn, String name, String adress ,int salery)

{
	this.jn=jn;
	this.name=name;
	this.adress =adress;
	this.salery=salery;
	
}


public int getjn()
{
	return jn;
}
public void setjn()
{
	this.jn=jn;
}
public String getname()
{
	return name;
}
public void setname()
{
	this.name=name;
}
public String getadress()
{
	return adress;
}
public void setadress()
{
	this.adress=adress;
}
public int getsalery()
{
	return salery;
}
public void setsalery()
{
	 this.salery=salery;
}
@Override
public String toString()
{
	return "cricketer[jn=" +jn + ", names" +name +", adress "+ adress + "salery" + salery+ "]+";
}







	
}
