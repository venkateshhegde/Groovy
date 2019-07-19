package test

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
