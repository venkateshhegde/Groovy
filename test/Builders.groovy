package test


import groovy.xml.MarkupBuilder

FileWriter fw = new FileWriter("a.xml")
MarkupBuilder builder = new MarkupBuilder(fw)

builder.sports {

    sport(id:1){
        name 'baseball'
    }
    sport(id:2){
        name 'basketball'
    }
    sport(id:3){
        name 'football'
    }
    sport(id:4){
        name 'outdoor'
    }

}

//Slurper to read data
def sports = new XmlSlurper().parse(new FileReader("a.xml"))

println(sports.sport[2].name)

println ""
