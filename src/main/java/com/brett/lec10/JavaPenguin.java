package com.brett.lec10;

public class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimable{

    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다~ 꿱꿱");
    }

    /**
     * 다리에 날개를 더해준다.
     * @return
     */
    @Override
    public int getLegCount() {
        return super.getLegCount()+this.wingCount;
    }

    @Override
    public void act() {
        JavaSwimable.super.act();
        JavaFlyable.super.act();
    }
}
