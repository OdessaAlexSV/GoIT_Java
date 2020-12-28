package main.java.botChat.point;

class PointTest {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        Point p4 = new Point();
        p4.setX(147);
        p4.setY(5);
        p4.setZ(460);

        Point p5 = null;

        Point p6 = new Point();
        p6.setX(1678);
        p6.setY(5);
        p6.setZ(460);

        Point p7 = new Point();
        p7.setX(147);
        p7.setY(125);
        p7.setZ(460);

        Point p8 = new Point();
        p8.setX(147);
        p8.setY(5);
        p8.setZ(342);

        Point p9 = new Point();
        p9.setX(147);
        p9.setY(5);
        p9.setZ(460);

        String p10 = "I'm a point";

        Point p11 = new Point();
        p11.setX(940);
        p11.setY(708);
        p11.setZ(697);

        Point p12 = new Point();
        p12.setX(605);
        p12.setY(428);
        p12.setZ(680);

        Point p13 = new Point();
        p13.setX(940);
        p13.setY(708);
        p13.setZ(697);

        Point p14 = new Point();
        p14.setX(605);
        p14.setY(428);
        p14.setZ(680);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
        System.out.println(p4.equals(p5)); //Should be false
        System.out.println(p4.equals(p6)); //Should be false
        System.out.println(p4.equals(p7)); //Should be false
        System.out.println(p4.equals(p8)); //Should be false
        System.out.println(p4.equals(p9)); //Should be false
        System.out.println(p4.equals(p10)); //Should be false

        System.out.println("*".repeat(15));

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
        System.out.println(p1.hashCode() == p2.hashCode()); //Should be true
        System.out.println(p1.hashCode() == p3.hashCode()); //Can be true or false

        System.out.println(p11.equals(p13)); //Should be true
        System.out.println(p12.equals(p14)); //Should be true

        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p1);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        StarTrack track4 = new StarTrack();
        track4.setStart(p11);
        track4.setFinish(p12);

        StarTrack track5 = new StarTrack();
        track5.setStart(p13);
        track5.setFinish(p14);

        System.out.println("*".repeat(15));
        System.out.println(track1.equals(track2)); //Should be true
        System.out.println(track1.equals(track3)); //Should be false
        System.out.println(track1.hashCode() == track2.hashCode()); //Should be true
        System.out.println(track4.equals(track5)); //Should be true
    }
}
