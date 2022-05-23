class Animal{  
void d(){
System.out.println("eating");
}  
}  
class Dog extends Animal{  
void disp(){
System.out.println("barking");
}  
}  
class Cat extends Animal{  
void d3(){
System.out.println("meow");
}  
}  
class HierDemo{  
public static void main(String args[]){  
Cat obj=new Cat();  
obj.d();  
obj.d3();

}
}  