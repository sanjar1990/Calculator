public class Addition extends Calculation {



    Addition(int a, int b){
        super(a,b);

    }

    @Override
    int add(){
        return super.getA()+super.getB();
    }

}
