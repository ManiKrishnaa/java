import java.util.*;
public class Flames 
{
  public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String n1,n2;
      System.out.println(" enter the boy name : ");
      n1 = sc.next();
      System.out.println(" enter the girl name : ");
      n2 = sc.next();
      char a[] = n1.toCharArray();
      char b[] = n2.toCharArray();
      int count1 = 0;
      int count2 = 0;
      if(n1.length() > n2.length())
      {
         for(int i=0; i<n1.length(); i++)
         {
            for(int j=0; j<n2.length(); j++)
             {
                if(a[i] == b[j])
                {
                     a[i] = b[j] = '*';
                }
             }
         }
      }else 
      {
         for(int j=0; j<n2.length(); j++)
         {
            for(int i=0; i<n1.length(); i++)
            {
               if(a[j] == b[i])
               { 
                  a[j] = b[i] = '*';
               }
            }
         }
      }

    for(int i=0; i<n1.length(); i++)
    {
      if(a[i] != '*')
      {
        count1++;
      }
    }
     
    for(int i=0; i<n2.length(); i++)
    {
      if(b[i] != '*')
      {
        count2++;
      }
    }
    int count = count1+count2;
    String f = "FLAMES";
    char n3[]  = f.toCharArray();
    int num = 0;
    for(int s=6;s>=2;s--)
    {
       if(count>s)
        num=count-s;
       else
         num=count;
      while(num>s)
      {
        num=num-s;
      } 
      f=f.substring(num,f.length())+(f.substring(0,num-1)); 
    }
    switch(f.charAt(0))
    {
      case 'F': System.out.println(" YOUR RELATIONSHIP ENDS IN FRIENDSHIP "); break;
      case 'L': System.out.println(" YOUR RELATIONSHIP ENDS IN LOVE "); break;
      case 'A': System.out.println(n1+" HAS MORE AFFECTION ON "+n2); break;
      case 'M': System.out.println(" YOUR RELATIONSHIP ENDS IN MARRIAGE "); break;
      case 'E': System.out.println(n1+" IS ENEMY TO "+n2); break;
      case 'S': System.out.println(" YOU ARE BOTH BROTHERS/SISTERS"); break;
    }
  }
}