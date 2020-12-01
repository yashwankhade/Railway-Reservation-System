import java.io.*;
public class IRCTC
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int amt[]=new int[20];
String namea[]=new String[20];
String named[]=new String[20];
String namet[]=new  String[20];
String quota[]=new String[20];
int qty[]=new int[20];
int price[]=new int[20];
int ticket[]=new int[20];
int no;
static int total,i=0;
 void pm()throws IOException
{
System.out.println("Trains Available");
System.out.println("1.SAHYADRI EXPRESS");
System.out.println("2.SINHAGAD EXPRESS");
System.out.println("3.DECCAN QUEEN");
System.out.println("4.KOYNA EXPRESS");
System.out.println("Enter Your Choice");
no=Integer.parseInt(br.readLine());
namea[i]="PUNE";
named[i]="MUMBAI";
switch(no)
{
case 1:System.out.println("YOU HAVE CHOSEN SAHYADRI EXPRESS");
       namet[i]="SAHYADRI EXPRESS";
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL     RS.90");
           System.out.println("SLEEPER     RS.140"); 
           System.out.println("AC 3-TIER   RS.490");
           System.out.println("AC 2-TIER   RS.695"); 
           System.out.println("Enter quantity AND quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=90;
               ticket[i]=price[i]*qty[i];
           }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=140;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=490;
               ticket[i]=qty[i]*price[i];
                
            }
           if(quota[i].equalsIgnoreCase("AC 2-TIER"))
           {
               price[i]=695;
               ticket[i]=qty[i]*price[i];
                
            }
        
break;
case 2:System.out.println("You have selected SINHAGAD EXPRESS");
       namet[i]="SINHAGAD EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.90");
           System.out.println("2nd SITTING     RS.140"); 
           System.out.println("AC CHAIR        RS.490");
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=90;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("2nd SITTING"))
           {
               price[i]=140;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC CHAIR"))
           {
               price[i]=490;
               ticket[i]=qty[i]*price[i];
            }
break;
case 3: System.out.println("You have selected DECCAN QUEEN");
        namet[i]="DECCAN QUEEN";
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.105");
           System.out.println("2nd SITTING     RS.105"); 
           System.out.println("AC CHAIR        RS.375");
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=105;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("2nd SITTING"))
           {
               price[i]=105;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC CHAIR"))
           {
               price[i]=375;
               ticket[i]=price[i]*qty[i];
            }           
break;
case  4:System.out.println("You have selected KOYNA EXPRESS");
        namet[i]="KOYNA EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.90");
           System.out.println("2nd SITTING     RS.90"); 
           System.out.println("AC CHAIR        RS.330");
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=90;
               ticket[i]=price[i]*qty[i];
            }
           if(quota[i].equalsIgnoreCase("2ndSITTING"))
           {
               price[i]=90;
               ticket[i]=price[i]*qty[i];
            }
           if(quota[i].equalsIgnoreCase("AC CHAIR"))
           {
               price[i]=330;
               ticket[i]=price[i]*qty[i];
            }  
break;
default:
System.out.println("WRONG CHOICE");
}
}
void pn()throws IOException
{
System.out.println("Trains Available");
System.out.println("1.PUNE-NAGPUR SUPERFAST EXPRESS");
System.out.println("2.PUNE-BILASPUR SUPERFAST EXPRESS"); 
System.out.println("3.PUNE-NAGPUR GARIBRATH EXPRESS");   
System.out.println("4.MAHARASHTRA EXPRESS");
System.out.println("Enter Your choice");
no=Integer.parseInt(br.readLine());
namea[i]="PUNE";
named[i]="NAGPUR";
switch(no)
{
case 1:System.out.println("You have selected PUNE-NAGPUR SUPERFAST EXPRESS");
       namet[i]="PUNE-NAGPUR SUPERFAST EXPRESS";    
       System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.265");
           System.out.println("SLEEPER         RS.460"); 
           System.out.println("AC 3-TIER       RS.1210");
           System.out.println("AC 2-TIER       RS.1725"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=265;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=460;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1210;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=1725;
                ticket[i]=qty[i]*price[i];
            }
break;
case 2:System.out.println("You have selected PUNE-BILASPUR SUPERFAST EXPRESS");
       namet[i]="PUNE-BILASPUR SUPERFAST EXPRESS";    
       System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.265");
           System.out.println("SLEEPER         RS.560"); 
           System.out.println("AC 3-TIER       RS.1210");
           System.out.println("AC 2-TIER       RS.1725"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=265;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=560;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1210;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=1725;
                ticket[i]=qty[i]*price[i];
            }
break;
case 3:System.out.println("You have selected PUNE-NAGPUR GARIBRATH EXPRESS");
       namet[i]="PUNE-NAGPUR GARIBRATH EXPRESS";    
       System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("AC 3-TIER       RS.800");
           System.out.println("Enter quantity ");
           qty[i]=Integer.parseInt(br.readLine());
           price[i]=800;
           ticket[i]=qty[i]*price[i];
break;
case 4:System.out.println("You have selected MAHARASHTRA EXPRESS");
       namet[i]="MAHARASHTRA EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.250");
           System.out.println("SLEEPER         RS.430"); 
           System.out.println("AC 3-TIER       RS.1160");
           System.out.println("AC 2-TIER       RS.1680"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=250;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=430;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1160;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=1680;
                ticket[i]=qty[i]*price[i];
            }
break;            
default:
System.out.println("WRONG CHHOICE");
 }
}
void mn()throws IOException
{
System.out.println("Trains Available");
System.out.println("1.VIDARBHA EXPRESS");
System.out.println("2.SEWAGRAM EXPRESS"); 
System.out.println("3.GITANJALI EXPRESS");   
System.out.println("4.NANDIGRAM EXPRESS");
System.out.println("Enter Your choice");
no=Integer.parseInt(br.readLine());
namea[i]="MUMBAI";
named[i]="NAGPUR";
switch(no)
{
case 1:System.out.println("You have selected VIDARBHA EXPRESS");
       namet[i]="VIDARBHA EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.255");
           System.out.println("SLEEPER         RS.445"); 
           System.out.println("AC 3-TIER       RS.1165");
           System.out.println("AC 2-TIER       RS.1665"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=255;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=445;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1165;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=1665;
                ticket[i]=qty[i]*price[i];
            }
break;
case 2:System.out.println("You have selected SEWAGRAM EXPRESS");
       namet[i]="SEWAGRAM EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.255");
           System.out.println("SLEEPER         RS.445"); 
           System.out.println("AC 3-TIER       RS.1165");
           System.out.println("AC 2-TIER       RS.1665"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=255;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=445;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1165;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=1665;
                ticket[i]=qty[i]*price[i];
            }
break;
case 3:System.out.println("You have selected GITANJALI EXPRESS");
       namet[i]="GITANJALI EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.255");
           System.out.println("SLEEPER         RS.445"); 
           System.out.println("AC 3-TIER       RS.1165");
           System.out.println("AC 2-TIER       RS.1665"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=255;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=445;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1165;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=1665;
                ticket[i]=qty[i]*price[i];
            }  
            
break;
case 4:System.out.println("You have selected NANDIGRAM EXPRESS");
       namet[i]="NANDIGRAM EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.280");
           System.out.println("SLEEPER         RS.500"); 
           System.out.println("AC 3-TIER       RS.1350");
           System.out.println("AC 2-TIER       RS.1965"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=280;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=500;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1350;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=1965;
                ticket[i]=qty[i]*price[i];
            }
            
default:
System.out.println("WRONG CHOICE");
 }
}
void md()throws IOException
{
System.out.println("Trains Available");
System.out.println("1.SWARAJ EXPRESS");
System.out.println("2.PASCHIM SF EXPRESS"); 
System.out.println("3.PUNJAB MAIL");   
System.out.println("4.GOLDEN TEMPLE MAIL");
System.out.println("Enter Your choice");
no=Integer.parseInt(br.readLine());
namea[i]="MUMBAI";
named[i]="DELHI";
switch(no)
{
case 1:System.out.println("You have selected SWARAJ EXPRESS");
       namet[i]="SWARAJ EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.345");
           System.out.println("SLEEPER         RS.585"); 
           System.out.println("AC 3-TIER       RS.1545");
           System.out.println("AC 2-TIER       RS.2240"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=345;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=585;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1545;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=2240;
                ticket[i]=qty[i]*price[i];
            }
break;
case 2:System.out.println("You have selected PASCHIM SF EXPRESS");
       namet[i]="PASCHIM SF EXPRESS";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.345");
           System.out.println("SLEEPER         RS.585"); 
           System.out.println("AC 3-TIER       RS.1545");
           System.out.println("AC 2-TIER       RS.2240"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=345;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=585;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1545;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=2240;
                ticket[i]=qty[i]*price[i];
            }
break;
case 3:System.out.println("You have selected PUNJAB MAIL");
       namet[i]="PUNJAB MAIL";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.370");
           System.out.println("SLEEPER         RS.630"); 
           System.out.println("AC 3-TIER       RS.1000");
           System.out.println("AC 2-TIER       RS.2415"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=370;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=630;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1000;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=2415;
                ticket[i]=qty[i]*price[i];
            }  
            
break;

case 4:System.out.println("You have selected GOLDEN TEMPLE MAIL");
       namet[i]="GOLDEN TTEMPLE MAIL";    
           System.out.println("TICKETS ARE AS FOLLOWS");
           System.out.println("GENERAL         RS.350");
           System.out.println("SLEEPER         RS.595"); 
           System.out.println("AC 3-TIER       RS.1550");
           System.out.println("AC 2-TIER       RS.2265"); 
           System.out.println("Enter quantity and quota");
           qty[i]=Integer.parseInt(br.readLine());
           quota[i]=br.readLine();
           if(quota[i].equalsIgnoreCase("GENERAL"))
           {
               price[i]=350;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("SLEEPER"))
           {
               price[i]=595;
               ticket[i]=qty[i]*price[i];
            }
           if(quota[i].equalsIgnoreCase("AC 3-TIER"))
           {
               price[i]=1550;
               ticket[i]=qty[i]*price[i];
            }  
            if(quota[i].equalsIgnoreCase("AC 2-TIER"))
            {
                price[i]=2265;
                ticket[i]=qty[i]*price[i];
            }
default:
System.out.println("WRONG CHOICE");
 }
}
void displaybill()
{
int sumt=0;
System.out.println( "SERIAL NUMBER \tSOURCE  \tDESTINATION  \tTRAIN NAME                                     \tQUOTA         \tQUANTIY     \tPRICE    \tTICKET");
for(int j=0;j<i;j++)
{
System.out.println((j+1) +"\t"+"\t"+namea[j]+"\t"+"\t"+named[j]+"\t"+"\t"+namet[j]+ "\t"+"\t"+"\t"+"\t"+quota[j]+ "\t"+"\t"+ qty[j]+ "\t"+"\t"+ price[j]+ "\t"+"\t" +ticket[j]);
sumt=sumt+ticket[j];
}
System.out.println("TOTAL AMOUNT TO BE PAID="+sumt);
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
IRCTC obj=new IRCTC();
String y=" ";
System.out.println("*        *  * * * *  *        * * * *  * * * * *       * * * * *     * * * * *  * * * * *  * * * * * * * * * * * * * *  * * * * * * * * * ");
System.out.println("*        *  *        *        *        *     * * *   * * *               *      *       *      *     *     * *              *     *       ");
System.out.println("*   *    *  * * * *  *        *        *     * *   *   * * * * *         *      *       *      *     * * * * *              *     *       ");
System.out.println("* *   *  *  *        *        *        *     * *       * *               *      *       *      *     *   *   *              *     *       ");
System.out.println("*        *  * * * *  * * * *  * * * *  * * * * *       * * * * *         *      * * * * *  * * * * * *     * * * * * *      *     * * * * ");
do
{
System.out.println("OPTIONS AVAILABLE ARE:");
System.out.println("1.PUNE-MUMBAI");
System.out.println("2.PUNE-NAGPUR");
System.out.println("3.MUMBAI-NAGPUR");
System.out.println("4.MUMBAI-DELHI");
System.out.println("Enter your choice");
int m=Integer.parseInt(br.readLine());
switch(m)
{
case 1: obj.pm(); 
break;
case 2:obj.pn();
 break; 
case 3:obj.mn();
break;
case 4:obj.md();
 break;
default:
System.out.println("WRONG CHOICE");
}
i++;
System.out.println("Do You want to continue Y/N");
y=br.readLine();
}
while(y.equalsIgnoreCase("y"));
obj.displaybill(); 
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("THANK YOU FOR USING THIS SOFTWARE!!!!");
}
}


                          