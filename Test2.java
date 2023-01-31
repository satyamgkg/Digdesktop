// Exception handling


class Test2
{
  public static void main [String args()]
    {
       try
           {
              int a=100;
              int b=0, c; 
              c = a/b;        
           }
         catch (ArithmeticException e)
          {
             System.out.println("Exception :"+e);
          }
         
       finally
           {
            System.out.println("I am finally block");
           }
    } 
 }