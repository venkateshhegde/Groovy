package test

import groovy.transform.ToString

println "hellotrue"

println 1.class

def whileLoopCounter=0
while (whileLoopCounter<5){whileLoopCounter++; println(whileLoopCounter)}
def listofNumbersToIterate = [1,2,3,4]
for (numb in listofNumbersToIterate){println(numb + 15)}

listofNumbersToIterate.each {println(it + 5)}

def switchCaseNumber = 5

switch (switchCaseNumber)
{
    case 1: println(switchCaseNumber)
        break;
    default:  println(switchCaseNumber*switchCaseNumber)
        break;
}

def  custObjFirst = new Cust(attributeX:"8", attributeY:"4")
def  custObjSecond = new Cust(attributeX:"6", attributeY:"3")
println(custObjFirst)

def setofCustomers = [custObjFirst, custObjSecond]

println(setofCustomers)

def sortedSetOfCustomers = setofCustomers.sort(false
    /*Do not modify original list*/)
println(sortedSetOfCustomers)

//Elvis operator
def firstNonNullNum = 9
def derivedNum = firstNonNullNum ?: 40 //note the ?: operator

//Safe navigation operator makes it not throw NPE
def paramThatHoldsNullInsteadOfNPEing = custObjFirst?.attributeX //Note the ?. operator

//Grape .. Dependency management
//@Grab(group='org.springframework', module='')

//GDK Methodd:
assert 2 == 2.5.toInteger()//methods provided for conversion etc..

//times.. upto .. downto  step

20.times {print('*')}
1.upto(5){print('^')}
5.downto(1){print('@')}
0.step(1.0,0.1,{iterableNum-> println(iterableNum)})


//Operator overloading
def numOneOperand=1
def numTwoOperand=1
println ((numOneOperand+numTwoOperand).class)
println(numOneOperand.plus(numTwoOperand))

def firstStrToConcat = "hello"
def secondStrToConcat = ", world"
println(firstStrToConcat+secondStrToConcat)

@ToString
class TestOperatorOverloadingClass
{
    int attributeOfAClass

    @Override
    boolean equals(Object obj) {
        return super.equals(obj)
    }

    TestOperatorOverloadingClass plus(TestOperatorOverloadingClass otherOperand)
    {
        TestOperatorOverloadingClass returnValue = new TestOperatorOverloadingClass() ;
        returnValue.attributeOfAClass = this.attributeOfAClass +
                otherOperand.getAttributeOfAClass()
        returnValue

    }

}

TestOperatorOverloadingClass tstObjectOperandOne = new TestOperatorOverloadingClass(attributeOfAClass: 2)

TestOperatorOverloadingClass tstObjectOperandTwo = new TestOperatorOverloadingClass(attributeOfAClass: 4)

println (tstObjectOperandOne+tstObjectOperandTwo)

println 'This is a miracle ${tstObjectOperandTwo.getAttributeOfAClass()} '

println "This is a miracle ${tstObjectOperandTwo.getAttributeOfAClass()} "

println '''
large message Multi escaped \' 
line
'''

println """
large message escaped Multi \"
line another
"""

//Dollar Slashy no need to escape
def folderNameOnWindows = $/c:\Users\Test/$
println folderNameOnWindows


//Regex Groovy Three additional
// //find
// //match boolean strict
// // pattern operator

//examples of regex
//abc => exact match
//b[aeiou]t => bat bet but bot bit
//<TAG\b]^>]*>(.*?)</TAG>.. Matches opening and closing of
// a specific HTMl tag
// \b[A-Z0-9._%+=]+@[A-Z0-9.-]+\.[A-Z{2,}\b email adddress check


//demo

import java.util.regex.Pattern;
Pattern regexPattern = Pattern.compile("a\\\\b")
println regexPattern
println regexPattern.class


//Groovy Simplification

//Slashy strings..

String msgForTestingRegex = /a\b/
println msgForTestingRegex

String msgHtmlURL = /http:\/\/yahoo.com/ //escaping slashies

println msgHtmlURL

def textToFindIn = "A quick brown fox jumped over the red dog."

def patternToLookFor = ~/brown fox jumped/


///////Finder
def finder = textToFindIn =~ patternToLookFor
println( finder)
println ''


/////////// Matcher
def matcher = textToFindIn ==~patternToLookFor

println matcher

def text = "brown fox"
def newPattern = ~/brown fox/
def matcherAnother = text==~newPattern

println matcherAnother

///////////////
textToFindIn = textToFindIn.replaceFirst(patternToLookFor, "green fox")
println textToFindIn

