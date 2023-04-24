package Ex1;

import static java.lang.Math.sin;

public class Paralelogram {
    Patrulater ptr;

    public Paralelogram(){
        this.ptr = new Patrulater();
    }

    public Paralelogram(int latura1, int latura2){
        this.ptr = new Patrulater(latura1, latura2, latura1, latura2);
    }

    public Paralelogram(double unghi1, double unghi2){
        this.ptr = new Patrulater(unghi1, unghi2, unghi1, unghi2);
    }

    public Paralelogram(int latura1, int latura2, double unghi1, double unghi2){
        this.ptr = new Patrulater(latura1, latura2, latura1, latura2, unghi1, unghi2, unghi1, unghi2);
    }

    public int arie(){
        int result;
        result = ptr.latura1 * ptr.latura2 * (int)sin(ptr.unghi1);
        return result;
    }
}
