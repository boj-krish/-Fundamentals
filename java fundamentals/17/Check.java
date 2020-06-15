public class Check
{
   public static void main(String args[])
   {
    int x=Integer.parseInt(args[0]);
    if(x==0)

      System.out.println(x+" is zero");
    else if(x>0)
      System.out.println(x+" is positive");
    else
      System.out.println(x+" is negative");
    }
}