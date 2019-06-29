package P1;
import java.lang.*;
import java.util.*;
public class student
{
	public String name;
	public double m1,m2;
	public student(String a,double b,double c)
	{
		name=a;
		m1=b;
		m2=c;
	}
	public void display()
	{
		System.out.println("NAME :"+name+"\n"+"MARKS1 :"+m1+"\n"+"MARKS2 :"+m2);	
	}
	

}
