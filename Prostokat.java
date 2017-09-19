
package javaapplication3;

import static java.lang.Math.sqrt;


public class Prostokat extends Kwadrat {
    private int bok2;
    private int bok1;
  
    Prostokat(){bok1=0;bok2=0;pole=0;}
    Prostokat(int a, int b){
        super(a);
        bok1=a;
        bok2=b;  
        this.pole=(int) ((sqrt(super.pole))*bok2);    
    }
    @Override
    public int getPole()
    {
        return this.pole;
    }
}
