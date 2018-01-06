//create a list
import scala.collection.mutable.ListBuffer
val  listOfString : List[String] =  List("alpha","gamma","omega","zeta","beta")
var  outPutList_1  =new ListBuffer[String]()
var  outPutList_2  =new ListBuffer[Int]()
var  outPutList_3  =new ListBuffer[String]()
var  outPutList_4  =new ListBuffer[String]()

//Problem 1
// find the count of all Strings with length 4
for ( element <- listOfString){
     if (element.length == 4){
       outPutList_1 += element
     }
}
println(outPutList_1)
println("count of all Strings with length 4: "+outPutList_1.size)

//Problem 2
//convert the list of string to a list of integers,
// where each string is mapped to its corresponding length


for ( element <- listOfString){
    outPutList_2 += element.length
}
println("new list of integers : "+outPutList_2)
println("count of all Strings with length 4: "+outPutList_2.size)



//Problem 3
//find count of all strings which contain alphabet ‘m’
for (element <- listOfString){
     if(element.contains('m')){
       outPutList_3 +=element
     }
}

println("List of all String which contains 'm':" + outPutList_3)



//Problem 4
//find the count of all strings which start with the alphabet ‘a’

for ( element <- listOfString){
  if(element.startsWith("a")){
    outPutList_4 +=element
  }
}

println("all strings which start with the alphabet ‘a’:" + outPutList_4)
println("count of all strings which start with the alphabet ‘a’:"
  + outPutList_4.size)
