
public class Box1 {

int height;
int width;
int length;
Box1()
{
}
Box1(int h,int w,int l)
{
height=h;
width=w;
length=l;
}
Box1(int n)
{

height=width=length=n;
}
void display()
{
System.out.println("height : "+height);
System.out.println("width : "+width);
System.out.println("len : "+length);
}
}
class Testclass2
{
public static void main(String[] args)
{
Box1 b1=new Box1(2,4,10);
Box1 b2=new Box1();
Box1 b3=new Box1(6);
b1.display();
b2.display();
b3.display();

}


}
