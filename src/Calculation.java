public  class Calculation {
    private int a;
    private int b;
    Calculation(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    int add(){
        return this.a+this.b;
    }
    int subtract(){
        return this.a-this.b;
    }
    int divide(){
        return this.a/this.b;
    }
    int multiple(){
        return this.a*this.b;
    }

}
