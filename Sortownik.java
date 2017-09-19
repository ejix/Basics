
package javaapplication3;

public class Sortownik

{
   public void SortujKwadraty(Kwadrat tab[])
   {
      
         Kwadrat temp;
         
          
       for(int seria=0;seria<tab.length;seria++)
       {
             for(int i=0;i<tab.length-1;i++)
             {
                 int a=tab[i].getBok();
                 int b=tab[i+1].getBok();
                 if(a>b)
                 {
                     temp=tab[i+1];
                     tab[i+1]=tab[i];
                     tab[i]=temp;                  
                 }
             }
         }
       for(int i=0;i<tab.length;i++)
       {
           int a=tab[i].getBok();
           System.out.println(a);
       }
   }
     public void SortujProstokaty(Prostokat tab[])
   {
      
         Prostokat temp;
         
          
       for(int seria=0;seria<tab.length;seria++)
       {
             for(int i=0;i<tab.length-1;i++)
             {
                 int a=tab[i].getPole();
                 int b=tab[i+1].getPole();
                 if(a>b)
                 {
                     temp=tab[i+1];
                     tab[i+1]=tab[i];
                     tab[i]=temp;                  
                 }
             }
         }
       for(int i=0;i<tab.length;i++)
       {
           int a=tab[i].getPole();
           System.out.println(a);
       }
   }
    
}
