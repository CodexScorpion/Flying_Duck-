public class RedheadDuck extends Duck {

    RedheadDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new Swims();
    }
    @Override
    public void display(){
        System.out.println("Ooo a RedHead Duck");
    }
}
