package JavaBasic.Practice.SendRedPacket;

import java.util.ArrayList;

public class Manager extends Users {
    public Manager(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> sendRedEnvelopes(int sendMoney, int redEnvelopesCount) {
        ArrayList<Integer> redEnvelopesList = new ArrayList<>();
        int remains = super.getBalance();
        if (sendMoney > remains) {
            System.out.println("Your Balance is not enough");
            return redEnvelopesList;
        }

        super.setBalance(remains - sendMoney);

        int avgMoneyInRedEnvelopes = (sendMoney / redEnvelopesCount);
        int mod = sendMoney % redEnvelopesCount;

        for (int i = 0; i < redEnvelopesCount - 1; i++) {
            redEnvelopesList.add(avgMoneyInRedEnvelopes);
        }

        int last = avgMoneyInRedEnvelopes + mod;
        redEnvelopesList.add(last);

        return redEnvelopesList;
    }

}
