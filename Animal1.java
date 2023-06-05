package oops;

public class Animal1 
{
	public void eat() 
	{
		System.out.println("Animal is eating ");
	}
}
class Dog1 extends Animal
{
	public void bark() 
	{
		System.out.println("dog is barking ");
	}
}
class BabyDog extends Dog1
{
	public void weep() {
		System.out.println("Baby dog is weeping");
	}
}




