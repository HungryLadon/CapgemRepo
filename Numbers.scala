/**
  * Created by Administrator on 18/07/2017.
  */
class Numbers {

  val english = Map(7->"sextillion",6->"quintillion",5->"quadrillion",4->"trillion",3->"billion",2->"million",1->"thousand and",0->"")
  val long = Map(7->"trilliard",6->"trillion",5->"billiard",4->"billion",3->"milliard",2->"million",1->"thousand and",0->"")
//
//  def toShortWords(int: String)={
//    val arr = int.reverse.split("(?<=\\G...)").reverse
//    val result = arr.map(x=>x.reverse.replaceFirst("^0*","") + english(arr.reverse.indexOf(x))).mkString(" ")
//
//  }
//
//
//  def toLongWord(int:String)={
//    val arr = int.reverse.split("(?<=\\G...)").reverse
//    val result = arr.map(x=>x.reverse.replaceFirst("^0*","") + long(arr.reverse.indexOf(x))).mkString(" ")
//
//  }
  //Above function doesn't work properly if you put the same numbers in.

  def toLongWord2(int:String):String={
    val arr = int.reverse.split("(?<=\\G...)")
    val result = (for(i<-0 until arr.length)yield {
      arr(i).reverse.replaceFirst("^0*","") + long(i)
    }).toList.reverse.mkString(" ")
    result
  }

  def toShortWord2(int:String):String={
    val arr = int.reverse.split("(?<=\\G...)")
    val result = (for(i<-0 until arr.length)yield {
      arr(i).reverse.replaceFirst("^0*","") + english(i)
    }).toList.reverse.mkString(" ")
    result

  }

}
