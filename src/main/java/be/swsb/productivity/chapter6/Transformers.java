package be.swsb.productivity.chapter6;

import be.swsb.productivity.chapter6.transformers.Autobot;
import be.swsb.productivity.chapter6.transformers.AutobotEnum;
import be.swsb.productivity.chapter6.transformers.Decepticon;

public class Transformers {

    public void disguise() {
        Autobot optimus = new Autobot(Autobot.optimusEnum());
        Decepticon megatron = new Decepticon();
        optimus.catchPhrase("Autobots!");
//        Decepticon.StarScream();
    }
}
