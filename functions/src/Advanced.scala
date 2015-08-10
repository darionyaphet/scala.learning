object Advanced {
    def add100(x:Int) = x + 100
    val add200 = (x:Int) => x + 200

    def fac(num:Int):Int = if(num<=0) 1 else num*fac(num-1)

    def combine(content:String,left:String = "{",right:String = "}") = left+content+right

    def connect(args:Int*) = {
        var result = 0 
        for(arg<-args){
            result+=arg
        }
        result
    }

    def main(args:Array[String]):Unit = {
        println(add100(1))
        println(add200(2))

        println(fac(4))

        println(combine("Hello,World"))
        println(combine("Hello,World","<",">"))

        println(connect(1,2,3,4))
    }
}
