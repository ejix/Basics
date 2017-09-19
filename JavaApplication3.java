package javaapplication3;

import java.math.*;



public class JavaApplication3 {

   
    public static void main(String[] args)
    
    
    {
        Kwadrat[]tabKwadrat=new Kwadrat[5];         //utworzenie tablicy kwadratow
        Prostokat[]tabProstokat=new Prostokat[5];   //utworzenie tablicy prostokatow
        double wynik,wynik2;                 //zmienne ktorych uzylem do wylosowania liczb na rozmiar boków figur
        
        
        for(int i=0;i<tabKwadrat.length;i++)        //wypelnienie tablicy kwadratow losowymi kwadratami za pomoca metody get bok
        {
            tabKwadrat[i]=new Kwadrat();
            wynik=Math.random()*100;
            tabKwadrat[i].setBok((int)wynik);
        }
        Sortownik sort=new Sortownik();
        System.out.println("Sortuje kwadraty: ");
        sort.SortujKwadraty(tabKwadrat);            //sortowanie kwadratow(po dlugosci boku)
        
        
        for(int i=0;i<tabProstokat.length;i++)              //wypelnienie tablicy prostokatow losowymi prostokatami przy pomocy konstruktora argumentowego
        {
        wynik=Math.random()*100;
        wynik2=Math.random()*100;
        tabProstokat[i]=new Prostokat((int)wynik2,(int)wynik);     
       
        }
        System.out.println("Sortuje Prostokaty: ");
        sort.SortujProstokaty(tabProstokat);            //sortowqanie prostokatow(po rozmiarze pola)
      
      int wektor[]=new int[10]; 
      int tabDwuWym[][]=new int [10][10];   //utworzenie tablicy dwuwymiarowej(zadanie nr 8)
      int tabDwuWym2[][]=new int [10][10];
        for (int i=0;i<tabDwuWym.length;i++){           //wypelnienie tablicy przypadkowymi liczbami(dalej zad nr 8)
            for(int j=0;j<tabDwuWym.length;j++)
            {wynik=Math.random()*100;
            tabDwuWym[i][j]=(int)wynik;
            }   
        }
   
       for (int i=0;i<tabDwuWym.length;i++){            //proste sprawdzenie czy metoda suma z matrixa działa
            for(int j=0;j<tabDwuWym.length;j++){
                tabDwuWym[i][j]=10;
                tabDwuWym2[i][j]=10;
            }}
           for(int i=0;i<wektor.length;i++)         //wypelnienie wektora
           {
               wektor[i]=10;
           }
        Matrix sss=new Matrix();
        System.out.println("Wyswietlam sume dwoch macierzy 10x10 wypelnionych 10: ");
        sss.suma(tabDwuWym,tabDwuWym2);
        System.out.println("Wyswietlam iloczyn  macierzy 10x10 i wektora wypelnionych 10: ");
        sss.iloczyn(tabDwuWym, wektor);
        
        
    } 
}