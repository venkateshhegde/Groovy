package test

//Traits

trait SpeakingAbility
{


    String canSpeak(){"can Speak"}
}

class Man implements SpeakingAbility
{
    int member=100
}

Man m = new Man()

println m.canSpeak()

println m.@member

//

