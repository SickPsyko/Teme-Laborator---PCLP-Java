package Ex1;

public class Dreptunghi {
    Paralelogram pgr;

    public Dreptunghi(){
        this.pgr = new Paralelogram();
    }

    public Dreptunghi(int latura1, int latura2){
        this.pgr = new Paralelogram(latura1, latura2, 90.0, 90.0);
    }

    public int arie(){
        int result;
        result = pgr.ptr.latura1 * pgr.ptr.latura2;
        return result;
    }
}
