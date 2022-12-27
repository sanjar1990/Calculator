public class Division extends Calculation{

    Division(int a, int b){
        super(a,b);
    }

    @Override
    public int divide(){
        return super.getA()/super.getB();
    }
}
