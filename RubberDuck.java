public class RubberDuck extends Duck {
    RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
        swimBehaviour = new Float();
    }
    @Override
    public void display(){
        System.out.println("It looks like a Rubber Duck");
    }
}
