public class calculator
{
public int add(int a,int b)
{
return a + b;
}
public int add(int a,int b,int c)
{
return a + b + c;
}
public double add(double a ,double b)
{
return a+b;
}
public void display(String name,int id)
{
System.out.println("Name:"+",Name:"+name);
public static void main(String[] args)
{
Calculator calc  = new Calculator();
System.out.println("Sum(2ints):"+calc.add(5,10));
System.out.println("Sum(3ints):"+calc.add(5,10,15));
System.out.println("Sum(2doubles):"+calc.add(2.5,3.5));

calc.display("Alice",101);
calls display(String,int);
calc.display(102,"Bob");
}
}



