// Exception handling

import java.io.FileInputStream;

class Test
{
  public static void main [String args()]
    {
       try
           {
              FileInputStream fis=new FileInputStream("d:/abc.txt");         
           }
         catch (Exception e)
          {
             System.out.println(e);
          }
            System.out.println("Hello");
    }
 }