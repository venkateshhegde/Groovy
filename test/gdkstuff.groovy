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