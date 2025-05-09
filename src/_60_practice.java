//01
abstract class pen{
      abstract void write();
      abstract void refill();
}
class fountain_pen{
     void write(){
        System.out.println("i am writing a new book");
    }
     void refill(){
        System.out.println("the process of refilling the pen is going on");
    }
    void changeNib(){
        System.out.println("Changing nib of the pen");
    }
}
//02
class monkey{
    void jump(){
        System.out.println("i am jumping");
    }
    void bite(){
        System.out.println("i am biting");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal {
    public void eat(){
        System.out.println("hello i am eating food");
    }
    public void sleep(){
        System.out.println("i am gonna sleep at 12 pm");
    }
}

//04
abstract class Telephone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();
}

class SmartTelephone extends Telephone{
        @Override
        void ring(){
            System.out.println("i am ringing");
         }

         @Override
        void lift(){
             System.out.println("lifting");
         }
        @Override
        void disconnect(){
             System.out.println("lifting");
          }

        void newfeature(){
            System.out.println("I have features like AI assistance etc.");
        }
}

//06
interface TVRemote{
    void changeChannel();
    void volume();
}
interface SmartTVRemote extends TVRemote{
    void Open_YT();
    void netflix();
}

//07
class TV implements SmartTVRemote{
    public void changeChannel(){
        System.out.println("changing the channel");
    }
    public void volume(){
        System.out.println("I can increase sound and decrease it");
    }

    @Override
    public void Open_YT() {
        System.out.println("Opening the YT");
    }

    @Override
    public void netflix() {
        System.out.println("Opening netflix so that u can play recent films and webseries");
    }

    void Update(){
        System.out.println("I can update ur tv");
    }
}
public class _60_practice {
    public static void main(String[] args) {
        System.out.println("Q1+2");
        fountain_pen f=new fountain_pen();
        f.write();
        f.refill();
        f.changeNib();

        System.out.println("Q3");
        human h=new human();
        h.bite();
        h.jump();
        h.sleep();

        System.out.println("Q4");
        Telephone t=new SmartTelephone();
        t.lift();
        t.ring();
        t.disconnect();
//        t.newfeature();  not accessible as ref is of telephone


        System.out.println("Q5 + 6");
        monkey m1=new human();
        m1.jump();
        m1.bite();
//      m1.sleep();//not allowed and reference is of
        // only monkey so only methods of the monkey will allwed

        basicAnimal mohit =new human();
        mohit.eat();
        mohit.sleep();
//      mohit.bite();//not possible as ref is of basicAnimal


        System.out.println("Q7");
        TV o=new TV();
        o.changeChannel();
        o.netflix();
        o.volume();
        o.Open_YT();

        System.out.println("Q7 polymorphism");
        SmartTVRemote o1=new TV();
        o1.changeChannel();
        o1.volume();
        o1.Open_YT();
//        o1.Update();// not allowed

    }
}
