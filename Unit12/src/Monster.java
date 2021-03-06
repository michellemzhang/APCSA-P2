//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;


	//write a default Constructor
	public Monster()
	{
		setWeight(0);
		setHeight(0);
		setAge(0);
	}

	//write an initialization constructor with an int parameter ht
	public Monster(int ht)
	{
		setWeight(0);
		setHeight(ht);
		setAge(0);
	}

	//write an initialization constructor with int parameters ht and wt
	
	public Monster (int ht, int wt)
	{
		setWeight(wt);
		setHeight(ht);
		setAge(0);
	}

	//write an initialization constructor with int parameters ht, wt, and age
	
	public Monster (int ht, int wt, int age)
	{
		setWeight(wt);
		setHeight(ht);
		setAge(age);
	}

	//modifiers - write set methods for height, weight, and age
	
	public void setHeight(int ht)
	{
		myHeight = ht;
	}
	
	public void setWeight(int wt)
	{
		myWeight = wt;
	}
	
	public void setAge(int age)
	{
		myAge = age;
	}

	//accessors - write get methods for height, weight, and age
	
	public int getHeight()
	{
		return myHeight;
	}
	
	public int getWeight()
	{
		return myWeight;
	}
	
	public int getAge()
	{
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	   
	}

	public boolean equals( Object obj )
	{
		Monster one = (Monster) obj;
		if (this.getHeight() == one.getHeight() && this.getWeight() == one.getWeight() && this.getAge() == one.getAge())
		{
			return true;
		}
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (this.getHeight() != rhs.getHeight()) {
			if (this.getHeight() > rhs.getHeight()){
				return 1;
			}
			if (this.getHeight() < rhs.getHeight()){
				return -1;
			}
		}
		if (this.getWeight() != rhs.getWeight()) {
			if (this.getWeight() > rhs.getWeight()){
				return 1;
			}
			if (this.getWeight() < rhs.getWeight()){
				return -1;
			}
		}
		if (this.getHeight() != rhs.getHeight()) {
			if (this.getAge() > rhs.getAge()){
				return 1;
			}
			if (this.getAge() < rhs.getAge()){
				return -1;
			}
		}
		return 0;
	}

	public String toString(){
		return getHeight() + " " + getWeight() + " " + getAge();
	//write a toString() method
	}
	
	
}