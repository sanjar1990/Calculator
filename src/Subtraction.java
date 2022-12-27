public class Subtraction extends Calculation{

    Subtraction(int a, int b) {
        super(a, b);
    }
    @Override
    public int subtract(){
        return super.getA()-super.getB();
    }
}
