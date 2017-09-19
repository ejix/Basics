
package javaapplication3;


public class Kwadrat {
    private int bok;
    int pole;
    Kwadrat() {bok=0;pole=0;}
    Kwadrat(int a) {bok=a;this.pole=bok*bok;}
    public void setBok(int bok)
    {
        this.bok=bok;
        this.pole=bok*bok;
    }
  
    public int getBok()
    {
        return this.bok;
    }
    public int getPole()
    {
         
        return this.pole;
    }
    
}
