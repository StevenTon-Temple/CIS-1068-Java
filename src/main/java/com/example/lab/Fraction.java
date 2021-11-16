package com.example.lab;

public class Fraction {
    int n;
    int d;

    public Fraction(int n, int d) {
        if (d!=0){
            this.n = n;
            this.d = d;
        }else throw new ArithmeticException();

    }

    public int getNum() {
        return n;
    }

    public int getDenom() {
        return d;
    }

    public void setNum(int n) {
        this.n = n;
    }

    public void setDenom(int d) {
        if (d!=0) {
            this.d = d;
        }else  throw new ArithmeticException();


    }

    public Fraction add(Fraction a) {

        int w = n;
        int x = d;
        int y = a.getNum();
        int z = a.getDenom();

        if (z == x) {
            n = w + y;
            d = d;
        } else {
            n = w * z + x * y;
            d = x * z;

        }
        reduce();

        return new Fraction(n, d);
    }
    public void reduce() {
            int gcd = 1;
            for (int i = 1; i <= n && i <= d; i++) {
                if (n % i == 0 && d % i == 0) {
                    gcd = i;
                }


            }
            n = n / gcd;
            d = d / gcd;
        }

        public boolean equals(Fraction a){
        int y = a.getNum();
        int z = a.getDenom();
        if (n==y && d==z){

            return true;
        }else return false;

    }
    public String toString(){
        return n + "/"+ d;
    }


}
