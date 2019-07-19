#!/usr/bin/env groovy
Person p = new  Person("Ven", "Hegde")

println p

assert 10 == 5*2

def ddd = [1,2,3,4,5]
ddd[0] = 16
assert ddd == [16, 2,3,4,5]

