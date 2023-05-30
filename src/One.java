public class One {
    int a,b,c,mno,sum;

    public One(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void dodavania(){
        sum=a+b+c;
        System.out.println(sum);
    }
    void mnozenia(){
        mno=(a*c)*b;
        System.out.println(mno);
    }
}
