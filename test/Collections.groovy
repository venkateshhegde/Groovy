package test

enum Days { S, M, T, W, Th, F, Sa}

def dayRange = Days.S.. Days.Th

println dayRange.toArray()

println dayRange

for(day in dayRange){
    println day
}


dayRange.each {day -> print day}

println dayRange.size

println dayRange.from
println dayRange.to
print dayRange.contains( Days.W )

for(day in dayRange){
    println day
}



def daysCollection = [ "S", "M", "T", "W", "Th", "F", "Sa"]

println daysCollection

daysCollection.pop()

daysCollection.add(0, "S")

println daysCollection

println daysCollection[0]


Map map = [4:"W", 1:"S", 2:"M", 3:"T"]
println map


println map.sort()

println (map.getClass().getName())

println map.size()



println map.keySet()
println map.values()



println "......"
//Collection Methods

List favs = [100, 200, 300, 10000]
for (num in favs)
{
    println num
}

favs.each{println it}


favs.eachWithIndex{ int entry, int i -> println "$entry $i"}

//find all

List perfSquare = favs.findAll {def x = Math.sqrt(it); if (x.toInteger()*x.toInteger() == it) return true }
println perfSquare

//Collect

List numbers = [10,20,30,40,50]

List listNumTimesTen = []
numbers.each{numb -> listNumTimesTen << numb*10}

println numbers
println listNumTimesTen

List newWayTimeTen = numbers.collect{num -> num*10}
println newWayTimeTen




