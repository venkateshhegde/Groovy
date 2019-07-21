package test

import groovy.time.TimeCategory

///interceptors
class InvokeDemo
{
    def test = {
    "methd exists"
    }
    def invokeMethod(String name, Object args)
    {
        "called InvokeD..."
    }

}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == "methd exists"

assert invokeDemo.someMethod() == "called InvokeD..."



class PropDemo
{
    def prop1="p1",prop2="p2",prop3="p3"

    def propertyMissing(String name)
    {
        "missing"
    }

    def methodMissing(String name, def args)
    {
        println "missing method $name $args"
    }
    def getProperty(String name)
    {
        println "in get..."
        if (metaClass.hasProperty(this, name))
        {
            metaClass.getProperty(this, name)
        }


    }
}

def pd = new PropDemo()
println pd.prop1
println pd.prop111
pd.foo("hello", 1)


///Meta Class
class Dev
{

}
//Meta Class . Objects or Class level

def f = new Dev()
println f.metaClass

Expando e = new Expando()
e.name = 'Ven'
e.writeCode = {-> println "Hello"}
e.writeCode()

f.metaClass.name = "Ven"
f.metaClass.writeCode= {-> println "Hello Meta!"}


f.name ="ven"

f.writeCode()


//Category Class
class StringCategory
{
    static String shout(String s){s.toUpperCase()}
}

use(StringCategory)
{
    println "HEllo Ven Test ".shout()

}

//println( "HEllo".shout())

use(TimeCategory)
{
    println 1.minute.from.now
    println 10.hours.ago

    def someDate = new Date()
    println someDate - 3.months

}


//Intercept Cache Invoke method.. by the grails guy