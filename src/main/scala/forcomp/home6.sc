package forcomp

import forcomp.Anagrams._

object home6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val hede = 5                                    //> hede  : Int = 5
  
  List(0, 1, 2, 1, 0).groupBy((element: Int) => element)
                                                  //> res0: scala.collection.immutable.Map[Int,List[Int]] = Map(2 -> List(2), 1 ->
                                                  //|  List(1, 1), 0 -> List(0, 0))
                                                  
  val name = "erkinnn"                            //> name  : String = erkinnn
  
  name.sortWith(_ < _)                            //> res1: String = eiknnnr
  
  name.toLowerCase.groupBy((element: Char) => element).map{
  	case (x, y) => (x, y.length)
  }.toList.sortWith( _._1 < _._1)                 //> res2: List[(Char, Int)] = List((e,1), (i,1), (k,1), (n,3), (r,1))
  
 	val abcdOccur = List(('a', 2), ('b', 2))  //> abcdOccur  : List[(Char, Int)] = List((a,2), (b,2))
 	
 	combinations(abcdOccur)                   //> res3: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,1)), List((a
                                                  //| ,2)), List((b,1)), List((b,2)), List((a,1), (b,1)), List((a,1), (b,2)), List
                                                  //| ((a,2), (b,1)), List((a,2), (b,2)))
 
  
  List("abcd", "e").mkString                      //> res4: String = abcde
  dictionaryByOccurrences get wordOccurrences("hedehodo")
                                                  //> res5: Option[List[forcomp.Anagrams.Word]] = None
  
  val capitalOfCountry = Map( "US" -> "Washington" , "Switzerland" -> "Bern" )
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)
  val capMethod = capitalOfCountry withDefaultValue "Ankara"
                                                  //> capMethod  : scala.collection.immutable.Map[String,String] = Map(US -> Washi
                                                  //| ngton, Switzerland -> Bern)
  capMethod("Hindu")                              //> res6: String = Ankara
  
  
  val sentence = List("Yes", "man")               //> sentence  : List[String] = List(Yes, man)
  
  sentence :+ "hede"                              //> res7: List[String] = List(Yes, man, hede)
  //combinations(sentenceOccurrences(List("Linux", "rulez"))).sorted
  sentenceAnagrams(List("Linux", "rulez"))        //> res8: List[forcomp.Anagrams.Sentence] = List()
}