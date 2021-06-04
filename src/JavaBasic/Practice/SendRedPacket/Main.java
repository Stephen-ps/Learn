package JavaBasic.Practice.SendRedPacket;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager("steven", 500);

        Members members1 = new Members("A", 0);
        Members members2 = new Members("B", 0);
        Members members3 = new Members("C", 0);


        //ArrayList<Integer> sendRedPack = manager.sendRedEnvelopes(400, 3);
        //
        //members1.receiveRedEnvelopes(sendRedPack);
        //members2.receiveRedEnvelopes(sendRedPack);
        //members3.receiveRedEnvelopes(sendRedPack);
        //manager.showsStatus();
        //members1.showsStatus();
        //members2.showsStatus();
        //members3.showsStatus();

        //查看两个对象是否相同
        boolean b = members1.equals(members2);
        System.out.println(b);
    }
}
