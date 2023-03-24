package Generics;

public class task3 {
	 public static void main(String args[])
     {  
           MyGenericClass<Integer> mint=new MyGenericClass<Integer>();  
           mint.add(2);
           MyGenericClass<String> mstr=new MyGenericClass<String>();  
           mstr.add("SoftwaretestingHelp");
 
           System.out.println("Member of MyGenericClass<Integer>:" + mint.get());
           System.out.println("Member of MyGenericClass<String>:" + mstr.get());
     }
}
class MyGenericClass<T>
{  
    T obj;  
    void add(T obj)
    {
           this.obj=obj;
    }  
    T get()
    {
           return obj;
    }  
}  