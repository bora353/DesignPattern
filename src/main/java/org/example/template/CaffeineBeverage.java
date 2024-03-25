package org.example.template;

public abstract class CaffeineBeverage {

    // final로 선언해서 오버라이드 못함
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }
    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
    
    // Coffee와 Tea에서 서로 다른 방식으로 처리하게 추상 메서드로
    abstract void brew();
    abstract void addCondiments();
   
}
