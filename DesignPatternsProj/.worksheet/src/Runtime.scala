
import patterns.SimUDuck._

object Runtime {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(77); 

   // Using Mallard as trait
  val m = new Duck("Mallard") with MallardDuck;System.out.println("""m  : patterns.SimUDuck.Duck with patterns.SimUDuck.MallardDuck = """ + $show(m ));$skip(8); 
  m.run;$skip(50); 

  val r = new Duck("Readhead") with ReadheadDuck;System.out.println("""r  : patterns.SimUDuck.Duck with patterns.SimUDuck.ReadheadDuck = """ + $show(r ));$skip(8); 
  r.run;$skip(52); 

  val rubDuck = new Duck("Rubber") with RubberDuck;System.out.println("""rubDuck  : patterns.SimUDuck.Duck with patterns.SimUDuck.RubberDuck = """ + $show(rubDuck ));$skip(14); 
  rubDuck.run;$skip(73); 
	// Using DecoyDuck as trait
  val dd = new Duck("Decoy") with DecoyDuck;System.out.println("""dd  : patterns.SimUDuck.Duck with patterns.SimUDuck.DecoyDuck = """ + $show(dd ));$skip(9); 
  dd.run;$skip(113); 
  // Can Dynamically create a new type of duck !
  val rocket = new Duck("RocketDuck") with RocketFly with Quack;System.out.println("""rocket  : patterns.SimUDuck.Duck with patterns.SimUDuck.RocketFly with patterns.SimUDuck.Quack = """ + $show(rocket ));$skip(13); 
  rocket.run}
}
