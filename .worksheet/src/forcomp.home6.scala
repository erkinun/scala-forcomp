package forcomp

import forcomp.Anagrams._

object home6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
  println("Welcome to the Scala worksheet");$skip(15); 
  val hede = 5;System.out.println("""hede  : Int = """ + $show(hede ));$skip(60); val res$0 = 
  
  List(0, 1, 2, 1, 0).groupBy((element: Int) => element);System.out.println("""res0: scala.collection.immutable.Map[Int,List[Int]] = """ + $show(res$0));$skip(74); 
                                                  
  val name = "erkinnn";System.out.println("""name  : String = """ + $show(name ));$skip(26); val res$1 = 
  
  name.sortWith(_ < _);System.out.println("""res1: String = """ + $show(res$1));$skip(129); val res$2 = 
  
  name.toLowerCase.groupBy((element: Char) => element).map{
  	case (x, y) => (x, y.length)
  }.toList.sortWith( _._1 < _._1);System.out.println("""res2: List[(Char, Int)] = """ + $show(res$2));$skip(46); 
  
 	val abcdOccur = List(('a', 2), ('b', 2));System.out.println("""abcdOccur  : List[(Char, Int)] = """ + $show(abcdOccur ));$skip(29); val res$3 = 
 	
 	combinations(abcdOccur);System.out.println("""res3: List[forcomp.Anagrams.Occurrences] = """ + $show(res$3));$skip(34); val res$4 = 
 
  
  List("abcd", "e").mkString;System.out.println("""res4: String = """ + $show(res$4));$skip(58); val res$5 = 
  dictionaryByOccurrences get wordOccurrences("hedehodo");System.out.println("""res5: Option[List[forcomp.Anagrams.Word]] = """ + $show(res$5));$skip(82); 
  
  val capitalOfCountry = Map( "US" -> "Washington" , "Switzerland" -> "Bern" );System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(61); 
  val capMethod = capitalOfCountry withDefaultValue "Ankara";System.out.println("""capMethod  : scala.collection.immutable.Map[String,String] = """ + $show(capMethod ));$skip(21); val res$6 = 
  capMethod("Hindu");System.out.println("""res6: String = """ + $show(res$6));$skip(42); 
  
  
  val sentence = List("Yes", "man");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(24); val res$7 = 
  
  sentence :+ "hede";System.out.println("""res7: List[String] = """ + $show(res$7));$skip(112); val res$8 = 
  //combinations(sentenceOccurrences(List("Linux", "rulez"))).sorted
  sentenceAnagrams(List("Linux", "rulez"));System.out.println("""res8: List[forcomp.Anagrams.Sentence] = """ + $show(res$8))}
}
