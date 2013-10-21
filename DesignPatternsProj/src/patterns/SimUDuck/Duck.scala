package patterns.SimUDuck

abstract class Duck(val name: String) {

  def swim = println("I can swim!")
  def display = println("I look like " + name)
  def fly
  def quack
  def run = {

    display
    swim
    fly
    quack
  }
}

// --------------------------------
trait MallardDuck extends Duck with FlyWithWings with Quack {
}

trait ReadheadDuck extends Duck with FlyWithWings with Quack {
}

trait RubberDuck extends Duck with CantFly with Quack {
}

trait DecoyDuck extends Duck with CantFly with CantQuack {
}


// ----------------------------

trait FlyBehavior {
  def fly
}

trait FlyWithWings extends FlyBehavior {
  def fly = println("I can fly!")
}

trait CantFly extends FlyBehavior {
  def fly = println("I cant fly!")
}

trait RocketFly extends FlyBehavior {
  def fly = println("I can fly with Rockets")
}


// -------------------------
trait QuackBehavior {
  def quack
}

trait Quack extends QuackBehavior {
  def quack = println("I can quack!")
}

trait Sqweak extends QuackBehavior {
  def quack = println("I can sqeak")
}

trait CantQuack extends QuackBehavior {
  def quack = println("I cant Quack")
}



