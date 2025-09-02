public class ResultProcessingSystem {
    public static void main(String[] args)  
{ 
System.out.println("Student Name:"+ args[0]); 
System.out.println("Student Roll no:"+ args[1]); 
System.out.println("Enter the marks(out of 100)"); 
int DBMS=Integer.parseInt(args[2]); 
System.out.println("DBMS marks:" +DBMS); 
int WDD=Integer.parseInt(args[3]); 
System.out.println("WDD marks:" +WDD); 
int JP=Integer.parseInt(args[4]); 
System.out.println("JP marks:" +JP); 
int CSS=Integer.parseInt(args[5]); 
System.out.println("CSS marks:" +CSS); 
int SEPM=Integer.parseInt(args[6]); 
System.out.println("SEPM marks:" +SEPM); 
float Total=DBMS+WDD+JP+CSS+SEPM; 
float Percentage= Total*100/500; 
System.out.println("The Percentage are:"+Percentage+"%"); 
if (Percentage<50)  
{ 
System.out.println("The result is FAIL"); 
} 
else if (Percentage>50 && Percentage<75)  
{ 
System.out.println("The result is Passed with First class"); 
} 
if(Percentage>75) 
{ 
System.out.println("The result is Passed with Distinction"); 
} 
} 

}
