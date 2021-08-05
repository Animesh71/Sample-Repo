public class User{
  public static void main(String[]args){
    System.out.println("Hello From User");
    System.out.println("Is number Prime ? :"+ isPrime(11));
}
  Public static int isPrime(int num)
{
for(int i=2;i<num/2;i++)
{
if(num%i==0)
{
return false;
break
}
return true;
}
}
     
