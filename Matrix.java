
package javaapplication3;


public class Matrix {
    protected void error(String msg)
    {
        throw new IllegalArgumentException(msg);
    }
    public void suma(int[][]tab1,int[][]tab2)
    {
        if((tab1.length==tab2.length)&&tab1[0].length==tab2[0].length)          //srpawdzenie czy tablice mozna dodac
        {
        int[][]suma=new int[tab1.length][tab1[0].length];                       //utworzenie tablicy w ktorej przechowamy wynik
        for(int i=0;i<suma.length;i++){                                     //petla sumujaca
            for(int j=0;j<suma[0].length;j++){
            
                suma[i][j]=tab1[i][j]+tab2[i][j];
            }
        }
        for(int i=0;i<suma.length;i++){                                 //wyswietlenie wyniku dodawania
            for(int j=0;j<suma[0].length;j++){
                System.out.print(suma[i][j]+" ");}System.out.println();}
    }else{error("Macierze sa roznej wielkosci");}                       //rzucony wyjatek jak nie bedzie mozna dodac macierzy
    }
    public void iloczyn(int[][]tab1,int[]wektor)
    {
        if(tab1[0].length==wektor.length)               //sprawdzenie czy mozna pomonzyc tablice przez wektor
        {
        int [][]wynik=new int[tab1.length][tab1[0].length];             //utworzenie tablicy mogacej przechowywac wynik
        for (int i=0;i<tab1.length;i++){                    //petla mnozaca
            for(int j=0;j<tab1[0].length;j++)
            {
                wynik[i][j]=tab1[i][j]*wektor[i];
            }
        }
        for (int i=0;i<tab1.length;i++){                //wyswietlenie wyniku
            for(int j=0;j<tab1[0].length;j++)
            {
               System.out.print(wynik[i][j]+" ");
            }
            System.out.println();
        }
}else error("nie mozna pomnozyc");                  //rzucony wyjatek jak nie bedzie mozna pomnozyc
    
    
    
    
}
}
