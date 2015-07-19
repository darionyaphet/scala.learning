
object loop {
    def main(args:Array[String]) : Unit = {
        for(i <-1 to 2 ;j <- 1 to 2){
            println(100*i+j)
        }

        for(i <- 1 to 2 ; j <- 1 to 2 if i!=j){
            println(100*i+j)
        }
    }
}
