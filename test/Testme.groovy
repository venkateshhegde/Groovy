package test

import groovy.grape.Grape

import java.awt.*


println "hellotrue"

println 1.class

def n=0
while (n<5){n++; println(n)}
def list = [1,2,3,4]
for (numb in list){println(numb + 15)}

list.each {println(it + 5)}


def num = 5

switch (num)
{
    case 1: println(num)
        break;
    default:  println(num*num)
        break;
}

def  c1 = new Cust(x:"8", y:"4")
def  c2 = new Cust(x:"6", y:"3")
println(c1)

def l = [c1, c2]

println(l)

def sorted = l.sort(false)
println(sorted)

//Elvis operator
def xx = 9
def yy = xx ?: 40

//Safe navigation operator makes it not throw NPE
def param = c1?.x

//Grape .. Dependency management
//@Grab(group='org.springframework', module='')

//GDK Methodd:
assert 2 == 2.5.toInteger()

//times.. upto .. downto  step

20.times {print('*')}
1.upto(5){print('^')}
5.downto(1){print('@')}
0.step(1.0,0.1,{numx-> println(numx)})

