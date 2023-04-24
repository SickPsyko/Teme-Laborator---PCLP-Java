package Ex1;

public class Patrat {
    Dreptunghi drg;

    public Patrat(){
        this.drg = new Dreptunghi();
    }

    public Patrat(int latura){
        this.drg = new Dreptunghi(latura, latura);
    }

    public int arie(){
        int result;
        result = drg.pgr.ptr.latura1 * drg.pgr.ptr.latura1;
        return result;
    }
}
