package main.java;


public class AloneAtHome {

    public static void main(String[] args) {
        /*
        char[][] house = new char[][]{
                "  o               o       #####".toCharArray(),
                "###########               #   #".toCharArray(),
                "#         #       o       #   # #".toCharArray(),
                "#         ############### #     #".toCharArray(),
                "#  X                           #".toCharArray(),
                "#                               #".toCharArray(),
                "#################################".toCharArray()
        };
        */

        /*
        char[][] house = new char[][]{
                "  o               o       ".toCharArray(),
                "###########               ".toCharArray(),
                "#         #       o       ".toCharArray(),
                "#         #               ".toCharArray(),
                "#  X     #                ".toCharArray(),
                "#       o#o               ".toCharArray(),
                "##########                ".toCharArray()
        };
        */

    char[][] house = new char[][]{
                "#################             ".toCharArray(),
                "#              o#   o         ".toCharArray(),
                "#          ######        o    ".toCharArray(),
                "####       #o                 ".toCharArray(),
                "   #       ###################".toCharArray(),
                "   #                         #".toCharArray(),
                "   #                  X      #".toCharArray(),
                "   ###########################".toCharArray()
        };

        printHouse(house);
        System.out.println(isAloneHome(house));
    }

    private static boolean isAloneHome(char[][] house) {
        for (int i = 1; i < house.length - 1; i++) {
            String currentStr = String.valueOf(house[i]);
            int indexO = currentStr.indexOf('o');

            if (indexO > 0) {
                int firstBorder = currentStr.indexOf('#');
                int lastBorder = currentStr.lastIndexOf('#');
                if (firstBorder < indexO && indexO < lastBorder) {
                    for (int j = 0; j < i; j++) {
                        if (house[j][indexO] == '#') {
                            for (int k = j + 1; k < house.length; k++) {
                                if (house[k][indexO] == '#') {
                                    System.out.println(i + ", " + indexO);
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static void printHouse(char[][] arr) {
        for (char[] str : arr) {
            System.out.println(String.valueOf(str));
        }
    }
}
