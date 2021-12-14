class Simple1{}  
  
class GetClassMethod{  
  void printName(Object obj){  
  Class c=obj.getClass();    
  System.out.println(c.getName());  
  }  
  public static void main(String args[]){  
   Simple1 s=new Simple1();  
   
   GetClassMethod t=new GetClassMethod();  
   t.printName(s);  
 }  
}  

