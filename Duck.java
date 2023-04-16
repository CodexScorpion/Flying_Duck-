public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    SwimBehaviour swimBehaviour;
    abstract public void display();
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
    public void performSwim(){swimBehaviour.swim();}

   public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour=fb;
    }
    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
}
