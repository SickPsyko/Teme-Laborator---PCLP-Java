package Ex1;

import static java.lang.Math.cos;
import static java.lang.Math.pow;

public class Romb {
    Paralelogram pgr;
    int diagonala1, diagonala2;

    public Romb(){
        this.pgr = new Paralelogram();
        this.diagonala1 = 0;
        this.diagonala2 = 0;
    }

    private int Diagonala1(){
        return this.diagonala1 = (int)pow(this.pgr.ptr.latura1, 2) * (int)pow(this.pgr.ptr.latura2, 2) * (int)cos(this.pgr.ptr.unghi2);
    }

    private int Diagonala2(){
        return this.diagonala2 = (int)pow(this.pgr.ptr.latura1, 2) * (int)pow(this.pgr.ptr.latura1, 2) * (int)cos(this.pgr.ptr.unghi1);
    }

    public Romb(int latura1, int latura2){
        this.pgr = new Paralelogram(latura1, latura2);
        Diagonala1();
        Diagonala2();
    }

    public Romb(double unghi1, double unghi2){
        this.pgr = new Paralelogram(unghi1, unghi2);
        Diagonala1();
        Diagonala2();
    }

    public int arie(){
        int result;
        result = (Diagonala1() * Diagonala2()) / 2;
        return result;
    }
}
