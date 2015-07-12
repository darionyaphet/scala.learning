
object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("Hello World");
        
        for(arg <- args){
            println(' '+arg)
        }
    }
}
