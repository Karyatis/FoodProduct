package com.example.foodproduct;

import static java.lang.System.out;

    public class FoodProduct {

        private String typefood;
        private int weight;
        private double cost;
        private int numservings;
        private int calories;

        public void setTypefood(String t) {
            typefood = t;
        }

        public String getTypefood() {
            return typefood;
        }

        public void setWeight(int a) {
            weight = a;
        }

        public int getWeight() {
            return weight;
        }

        public void setCost(double c) {
            cost = c;
        }

        public double getCost() {
            return cost;
        }

        public void setNumservings(int x) {
            numservings = x;
        }

        public int getNumservings() {
            return numservings;
        }

        public void setCalories(int y) {
            calories = y;
        }

        public int getCalories() {
            return calories;
        }

        public void calculatecaloriesperserving() {
            int result;
            result = numservings * calories;
            out.print(result);
        }

        public static void main(String args[]) {

            FoodProduct a = new FoodProduct();
            a.setTypefood("Peach Slices");
            a.setWeight(500);
            a.setCost(1.83);
            a.setNumservings(4);
            a.setCalories(100);

            out.println(a.getCost());

            a.calculatecaloriesperserving();
        }

    }
