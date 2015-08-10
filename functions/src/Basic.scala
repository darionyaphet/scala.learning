
object Basic {
    println("Static Code Block Is Running ...")

    def loop(x:Long , y:Long):Long = {
        var a = x
        var b = y

        while(a!=0){
            val temp = a
            a = b % a
            b = temp
        }

        b
    }

    def loopRead() {
        var line = ""
        do{
            line = readLine()
            println("Reading From Console : "+line)
        }while(line != "")
    }

    def forLoop(){
        for(index <- 1 to 10){
            println("Number Index : "+index)
        }
    }

    def main(args: Array[String]) {
        //loopRead

        //println(loop(100,298))

        //var value = "value"
        //if(!args.isEmpty)
        //    value = args(0)
        //println("Value : "+value)

        //val value = if(!args.isEmpty) args(0) else "value"
        //println("Value : "+value)

        forLoop
    }
}
