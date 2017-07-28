/**
  * Created by Administrator on 19/07/2017.
  */
 class Cipher {

  val map = ('a' to 'z').reverse.zip('a' to 'z').toMap

  def returnString(string: String):String={
    string.toLowerCase.toList.map(x=>if(map.contains(x)) {map(x)} else x ).mkString
  }

}
