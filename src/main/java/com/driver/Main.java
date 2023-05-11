package com.driver;

public class Main {

    public static void main(String[] args){

        Product p = new Product();

        p.product(2, 2);
        p.product(2, 2, 2);
        p.product(2.0, 2.0);
    }

    static class Product{

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return this.product(x,y) * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }
}

