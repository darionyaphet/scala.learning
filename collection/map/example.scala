
object example{
    def main(args:Array[String]) :Unit = {
        val map = Map("firstName"->"darion","lastName "->"yaphet")
        for((key,value)<-map){
            println(key+" : "+value)
        }

        for((key,_) <- map){
            println(key)
        }
    }
}
