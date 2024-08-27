
package javaapplication14;

import java.util.Scanner;
public class JavaApplication14 {

    public static void main(String[] args) {
        
            while(true){
        // String[] products={"camera","printer","cable"};
         //int[] proamo={36,75,88};
         //double[] procoast={55.5,73,125};
         int[] amo=new int[1000];
         double[] cos=new double[1000];
         String[] npr=new String[1000];
         int codpr = 0;
         Scanner A=new Scanner(System.in);
         System.out.println("1001  input a new product\n0     to get information about product\n1     to sell a product");
         System.out.print("Enter a button: ");
         int button=A.nextInt();

///////////////////////////////////////////////////////////////////////////////
         if(button==1001)
        {
        System.out.print("Enter code product: ");
        codpr=A.nextInt();
        System.out.print("Enter amount of product: ");
        amo[codpr]=A.nextInt();
        System.out.print("Enter cost of product: ");
        cos[codpr]=A.nextDouble();
        System.out.println("Enter name of product: ");
        npr[codpr]=A.nextLine();
        Products p1=new Products(amo[codpr],cos[codpr],npr[codpr]);
        amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.println("Amount of this product = "+Products.y);
        //if condition222 
        System.out.println("Enter 0 to get information or 1 to sell product");
        int buttonsss=A.nextInt();
        if(buttonsss==0)
        {
        amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.print("Enter code of product: ");
        int buttonch1=A.nextInt();
        System.out.println("It's cost is "+cos[buttonch1]+" and amount is "+amo[buttonch1]);
        }
        else if(buttonsss==1)
        {
        amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.print("Enter code of product to sell: ");
        int buttonch2=A.nextInt();
        System.out.print("Enter amount you want to sell: ");
        int buttonamosell=A.nextInt();
        System.out.print("Amount is: "+buttonamosell+"\nit coast "+(buttonamosell*cos[buttonch2])+"\n");

         System.out.println("\n amount of product after selling = "+((Products.y)-buttonamosell));
        }
        }
         /////////////////////////////////////////////////////////////////
         else if(button==0)
         {
             amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.print("Enter code of product: ");
        int buttonch1=A.nextInt();
        System.out.println("It's cost is "+cos[buttonch1]+" and amount is "+amo[buttonch1]);
        int buttonsss1=A.nextInt();
        System.out.println("Enter 1001 to input new products or 1 to sell a product");
             if(buttonsss1==1001)
        {
        System.out.println("Enter code product: ");
        codpr=A.nextInt();
        System.out.println("Enter amount of product: ");
        amo[codpr]=A.nextInt();
        System.out.println("Enter cost of product: ");
        cos[codpr]=A.nextDouble();
        System.out.println("Enter name of product: ");
        npr[codpr]=A.nextLine();
        Products p1=new Products(amo[codpr],cos[codpr],npr[codpr]);
        amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.println("amoun of oss on first condition is "+Products.y);
        //if condition222 
        }
        
        else if(buttonsss1==1)
        {
        amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.print("Enter code of product to sell: ");
        int buttonch2=A.nextInt();
        System.out.print("Enter amount you want to sell: ");
        int buttonamosell=A.nextInt();
        System.out.print("Amount is: "+buttonamosell+"\nit coast "+(buttonamosell*cos[buttonch2])+"\n");

         System.out.println("\n amount of product after selling = "+((Products.y)-buttonamosell));
        }
        }
         ////////////////////////////////////////////////////////////////////
         
         else if(button==1)
         {
             amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.print("Enter code of product to sell: ");
        int buttonch2=A.nextInt();
        System.out.print("Enter amount you want to sell: ");
        int buttonamosell=A.nextInt();
        System.out.print("Amount is: "+buttonamosell+"\nit coast "+(buttonamosell*cos[buttonch2])+"\n");

         System.out.println("\n amount of product after selling = "+((Products.y)-buttonamosell));
         System.out.println("Enter 0 to get information about a product or 1001 to input new products");
         int buttonsss2=A.nextInt();
         if(buttonsss2==0)
         {
        amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.print("Enter code of product: ");
        int buttonch1=A.nextInt();
        System.out.println("It's cost is "+cos[buttonch1]+" and amount is "+amo[buttonch1]);
         }
         else if(buttonsss2==1001)
         
         codpr=A.nextInt();
        amo[codpr]=A.nextInt();
        cos[codpr]=A.nextDouble();
        npr[codpr]=A.nextLine();
        Products p1=new Products(amo[codpr],cos[codpr],npr[codpr]);
        amo[2]=Products.y;
        cos[2]=Products.m;
        npr[2]=Products.n;
        System.out.println("amoun of oss on first condition is "+Products.y);
         }
         
        
        

      //  String[] products={"cam1","cam2","cam3"};
        
    }
    
}
}