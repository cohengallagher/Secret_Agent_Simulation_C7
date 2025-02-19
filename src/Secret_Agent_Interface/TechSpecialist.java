package Secret_Agent_Interface;

import java.util.Random;

public class TechSpecialist implements SecretAgent{
    @Override
    public void gatherIntel() {
        System.out.println("Hacking into encrypted databases to extract classified information...");
    }

    @Override
    public void useGadget() {
        System.out.println("Deploying a surveillance drone for remote intel gathering.");
    }

    @Override
    public String coverIdentity() {
        return "Cover Identity: Cybersecurity consultant.";
    }

    @Override
    public boolean completeMission() {
        Random random = new Random();
        int hackDifficulty = random.nextInt(100);
        if (hackDifficulty < 60) {
            System.out.println("Hack successful! You gained access to enemy blueprints.");
            return true;
        }
        else {
            System.out.println("Hack failed! Firewalls triggered an alarm, escape quickly!");
            return false;
        }
    }
}