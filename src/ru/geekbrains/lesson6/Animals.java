package ru.geekbrains.lesson6;


public abstract class Animals {
    private int runMaxDistance;
    private int swimMaxDistance;
    private int jumpMaxDistance;

    public Animals(int runMaxDistance, int swimMaxDistance, int jumpMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }

    public void run(int runDistance){
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }

    public void swim(int swimDistance){
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }

    public void jump(int jumpHeight){
        System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
    }






}
