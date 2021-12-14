class Simple2{}  
interface My{}  
  
class CheckInterface{  
 public static void main(String args[]){  
  try{  
   Class c=Class.forName("Simple2");  
   System.out.println(c.isInterface());
     
   Class c2=Class.forName("My");  
   System.out.println(c2.isInterface());  
    
  }catch(Exception e){System.out.println(e);}  
  
 }  
}
