package bai1;

public class Fraction
{
    private int numerator;
    private int denominator;
    public Fraction(){
        numerator=0;
        denominator=1;
    };

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(int num,int den){
        if(den==0){
            System.out.println("mau so phai khac 0!!");
            num=0;
            den=10;
        } else{
            this.numerator=num;
            this.denominator=den;
        }
    };
    public Fraction( Fraction f ){
        this.numerator=f.numerator;
        this.denominator=f.denominator;
    };
    public Fraction add(Fraction f){
        int tuso=(numerator*f.denominator)+(denominator*f.numerator);
        int mauso=denominator*f.denominator;
        return new Fraction(tuso,mauso);

    };
    public Fraction sub(Fraction f){
        int tuso=(numerator*f.denominator)-(denominator*f.numerator);
        int mauso=denominator*f.denominator;
        return new Fraction(tuso,mauso);

    };
    public Fraction mul(Fraction f){
        int tuso=numerator*f.numerator;
        int mauso=denominator*f.denominator;
        return new Fraction(tuso,mauso);

    };
    public Fraction div(Fraction f){
        int tuso=numerator*f.denominator;
        int mauso=denominator*f.numerator;
        return new Fraction(tuso,mauso);

    };
    public Fraction reduce(){
        int a=numerator;
        int b=denominator;
        while(numerator!=denominator){
            if(numerator>denominator){
                numerator-=denominator;
            } else {
                denominator-=numerator;
            }
        }
        a/=numerator;
        b/=denominator;
        return new Fraction(a,b);

    };
    @Override
    public String toString(){
        return numerator+"/"+denominator;
    };
}
