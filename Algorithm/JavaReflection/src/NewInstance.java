class Simple3{  
 void message(){System.out.println("Hello Java");}  
}  
  
class NewInstance{  
 public static void main(String args[]){  
  try{  
  Class c=Class.forName("Simple3");  
  Simple3 s=(Simple3)c.newInstance();  
  s.message();  
  
  }catch(Exception e){System.out.println(e);}  
  
 }  
}