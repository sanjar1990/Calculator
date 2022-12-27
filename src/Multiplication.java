public class Multiplication extends Calculation{
    Multiplication(int a, int b){
        super(a,b);
    }

    @Override
    int multiple(){
        return super.getA()*super.getB();
    }
}
