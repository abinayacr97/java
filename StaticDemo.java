class StaticDemo{
static int count;
StaticDemo()
{
count=count+1;
}
static void display()
{
System.out.println("the no of obj created is:"+count);
}
public static void main(String[] args)
{
StaticDemo s1=new StaticDemo();
StaticDemo s2=new StaticDemo();
StaticDemo s3=new StaticDemo();
StaticDemo.display();
}
}
