import scala.reflect.runtime.universe

object Main extends App {

// soon this stupidity will work
//  val mirror = universe.runtimeMirror(getClass.getClassLoader)
//  Seq(Day1, Day2, Day3)
//    .filter(day => args.contains(day.getClass.getSimpleName.stripSuffix("$")))
//    .map(day => (day, day))
//    .map{ case (day, h) => (universe.typeOf[day.type].typeSymbol.asClass, h)}
//    .map{ case (dayClassSymbol, day) => (mirror.reflectClass(dayClassSymbol), day)}
//    .map{ case ( classMirror, day) => (classMirror, universe.typeOf[day.type].decl(universe.termNames.CONSTRUCTOR).asMethod)}
//    .map{ case (classMirror, constructorSymbol) => classMirror.reflectConstructor(constructorSymbol)}
//    .foreach(mm => {val s = mm()})


  args.foreach(arg => arg.toLowerCase match {
    case "day1" => new Day1
    case "day2" => new Day2
    case "day3" => new Day3
  })

}