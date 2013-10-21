
import patterns.SimUDuck._

object Runtime {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

   // Using Mallard as trait
  val m = new Duck("Mallard") with MallardDuck    //> m  : patterns.SimUDuck.Duck with patterns.SimUDuck.MallardDuck = Runtime$$an
                                                  //| onfun$main$1$$anon$1@4ce2cb55
  m.run                                           //> I look like Mallard
                                                  //| I can swim!
                                                  //| I can fly!
                                                  //| I can quack!

  val r = new Duck("Readhead") with ReadheadDuck  //> r  : patterns.SimUDuck.Duck with patterns.SimUDuck.ReadheadDuck = Runtime$$a
                                                  //| nonfun$main$1$$anon$2@b6e39f
  r.run                                           //> I look like Readhead
                                                  //| I can swim!
                                                  //| I can fly!
                                                  //| I can quack!

  val rubDuck = new Duck("Rubber") with RubberDuck//> rubDuck  : patterns.SimUDuck.Duck with patterns.SimUDuck.RubberDuck = Runtim
                                                  //| e$$anonfun$main$1$$anon$3@6766afb3
  rubDuck.run                                     //> I look like Rubber
                                                  //| I can swim!
                                                  //| I cant fly!
                                                  //| I can quack!
	// Using DecoyDuck as trait
  val dd = new Duck("Decoy") with DecoyDuck       //> dd  : patterns.SimUDuck.Duck with patterns.SimUDuck.DecoyDuck = Runtime$$ano
                                                  //| nfun$main$1$$anon$4@4e17e4ca
  dd.run                                          //> I look like Decoy
                                                  //| I can swim!
                                                  //| I cant fly!
                                                  //| I cant Quack
  // Can Dynamically create a new type of duck !
  val rocket = new Duck("RocketDuck") with RocketFly with Quack
                                                  //> rocket  : patterns.SimUDuck.Duck with patterns.SimUDuck.RocketFly with patte
                                                  //| rns.SimUDuck.Quack = Runtime$$anonfun$main$1$$anon$5@5975d6ab
  rocket.run                                      //> I look like RocketDuck
                                                  //| I can swim!
                                                  //| I can fly with Rockets
                                                  //| I can quack!
}