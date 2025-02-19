package Secret_Agent_Interface;

import java.util.Random;

public class DemolitionExpert implements SecretAgent{
    @Override
    public void gatherIntel() {
        System.out.println("Planting tiny surveillance bugs inside enemy HQ...");
    }

    @Override
    public void useGadget() {
        System.out.println("Setting up a controlled explosion to breach the facility!");
    }

    @Override
    public String coverIdentity() {
        return "Cover Identity: Construction site supervisor";
    }
    @Override
    public boolean completeMission() {
        Random random = new Random();
        int explosionRisk = random.nextInt(100);
        if(explosionRisk < 70) {
            System.out.println("Explosion was perfectly timed! Enemy defenses are down.");
            return true;
        }
        else {
            System.out.println("Explosion misfire! You blew your own cover, time to run!");
            return false;
        }
    }
}