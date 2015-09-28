//args.foreach(arg => println(arg))
//args.foreach(println)
// for (arg <- args){
// 	println(arg)
// }
def printArgs(args: Array[String]) = {
	var i = 0
	while (i < args.length) {
		println (args(i))
		i+=1
	}
}

def printArgs1(args: Array[String]) = {
	for( arg <- args) {
		println(arg)
	}
}

def printArgs2(args: Array[String]) = {
	args.foreach(println)
}