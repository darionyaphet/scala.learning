val xml = 
<symbols>
  <symbol ticker="AAPL"> 
    <units>200</units> 
  </symbol>
  <units>300</units>                                                     
  <symbol ticker="IBM"> 
    <units>400</units> 
  </symbol> 
  </symbols> 

println(xml)
println(xml.getClass)

val unitsNode = xml \ "units"
println(unitsNode)
println(unitsNode.getClass)

