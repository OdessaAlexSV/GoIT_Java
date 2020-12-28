package main.java.botChat.spaceModel;

class PlanetTester {

    public String test(SpaceObject object) {
        if (object instanceof Planet) {
            return "planet";
        } else {
            return "not planet";
        }
    }

    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be true
        System.out.println(tester.test(new Moon())); //Should be false
    }
}
