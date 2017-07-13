package acadgildclassesobjects

object ScalaAssignment2 {

  def main(args:Array[String]){
    var listTuples=List((1,"alpha"),(2,"beta"),(3,"gamma"),(4,"zeta"),(5,"omega"))
    //print the numbers where corresponding string length is 4
    for(tuple<-listTuples if tuple._2.length==4)println("nubers with corresponding string length 4:"+tuple._1)
    //find average of all numbers , where corresponding string contains alphabet 'm' or'z'
    var count=0
    var sum=0
    for(tuple<-listTuples if tuple._2.contains('m')||tuple._2.contains('z'))
      {
      count+=1
      sum+=tuple._1
      }
    println("Averge is :"+sum/count);
  }
}