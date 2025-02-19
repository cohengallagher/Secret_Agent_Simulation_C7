package Secret_Agent_Interface;

import java.util.Random;

public class StealthOperative implements SecretAgent {

    @Override
    public void gatherIntel() {
        System.out.println("Sneaking into a high-security base to gather intel...");
    }

    @Override
    public void useGadget() {
        System.out.println("Using a disguise kit to blend in unnoticed.");
    }

    @Override
    public String coverIdentity() {
        return "Cover Identity: Undercover as a journalist.";
    }

    @Override
    public boolean completeMission() {
        Random random = new Random();
        boolean success = random.nextBoolean();
        if(success)
            System.out.println("You successfully extracted the top-secret documents and escaped!");
        else
            System.out.println("You were spotted! Time to escape before the alarms go off!");
        return success;
    }
}