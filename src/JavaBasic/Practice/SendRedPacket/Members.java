package JavaBasic.Practice.SendRedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Members extends Users {


    public Members(String name, int balance) {
        super(name, balance);
    }

    public void receiveRedEnvelopes(ArrayList<Integer> receiveList){
        int index = new Random().nextInt(receiveList.size());
        int delta = receiveList.remove(index);
        int Money = super.getBalance();

        super.setBalance(Money + delta);
    }

}
