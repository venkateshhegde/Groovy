package test

//File IO
def file = new File("a.txt")
file.write("HELLO")


file.append("\nBye")

def lines =  file.readLines()
for (String line in lines)
{
    println " line : $line"
}


def folder = "."

new File(folder).eachFile {
    fileI -> println "$fileI.absolutePath"


}

//Threading
def t = new Thread( {

    println("hello" + Thread.currentThread().name)

})

t.start()

sleep(1000)
Thread.start('HELLOONE') {
    sleep 1000
    println("hello" + Thread.currentThread().name)
}
println( '100')


//JDBC
//

//Templates
//LIke JSPs!

//Dates..