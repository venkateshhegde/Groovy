package test
//Closures are big part of the language .. Groovy strength

//method - first class citizen..
//Closure is an object.. that can be passed around

//Iterators, callbacks, higher order functions - func calling other funcs
// Specialized control structures, create your own control structures
// Builders - HTML, XML..
//Resource Allocation (reclaim resources)
//Threads
//DSLs Domain specific language
//Fluent interfaces -concise

def c ={println "hello"}
c()

def sayhello = {name , addressing-> println "hello $addressing $name"}

sayhello "Ven", "mister"


def timesTen(num, closure )
{
 closure(num*10)
}


timesTen(10, {println it})

timesTen 2, {println it}


//Closure as last argument
timesTen (3) {println it}

10.times{println it}

import java.util.Random
Random randomeNum = new Random()
2.times {println randomeNum.nextDouble()}

//implicit param 'it'
def foo = {println it}

foo(1001)


def parameterlessCall = {->
 println("No Params")
}

parameterlessCall()

//Will fail parameterlessCall(111)

def sayHelloParams = {first, last = "Smith"-> println "hello $first $last"}

sayHelloParams ("ven" , "Hegde")

sayHelloParams ("ven" )

//Var Args example
def concatMe = {String... args  -> args.join('')}

println concatMe ("100","100","100")


def someMethod(Closure c)
{
 println "..."
 println c.maximumNumberOfParameters
 println c.parameterTypes
}


def someClosure = {int x, int y -> x+y}

someMethod (someClosure)



//Curry
def log = { String type, Date date, String msg ->
 println "$type $date $msg"
}

log "DEBUG",new Date(), "Hello! World"

def debug = log.curry("DEBUG")
def todayDebug = log.curry("DEBUG", new Date())
todayDebug("Hello ")

//rcurry
def crazyLog = log.rcurry("Why?")
crazyLog("ERROR", new  Date())

//n curry
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("ERROR", "HELLO NCURRY")

//Closure

def p = println()

class ScopeDemo{
 def outerClosure = {
  println this.class.name
  println owner.class.name
  println delegate.class.name
  def nestedClosure = {
   println this.class.name
   println owner.class.name
   println delegate.class.name
  }
  println("")
  nestedClosure()
 }
}

def demo = new  ScopeDemo()
demo.outerClosure()


//Delegate Groovy

def writer = {
 append "Ven"
 append "Hegde is cool!"
}

def append(String s){
 println "AppendMe $s"
}

StringBuffer sb = new StringBuffer()
writer.delegate = sb
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer()

println sb


//COLECTION AND CLOSURES
//find findAll
////any  every
// groupby


