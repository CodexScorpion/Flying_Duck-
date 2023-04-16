public class MallardDuck extends Duck {

    MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new Swims();
    }
    @Override
    public void display(){
        System.out.println("It looks like a Mallard");
    }

}
