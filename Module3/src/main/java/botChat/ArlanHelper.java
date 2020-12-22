package main.java.botChat;

public class ArlanHelper {

    public String drawQuad(int n) {
        String result = "";
        int i = 0;
        while (i++ < n) {
            int j = 0;
            while (j++ < n) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public String drawQuadNew(int n) {
        String result = "";
        int lines = n;
        while (lines > 0) {
            lines--;
            int columns = n;
            while (columns > 0) {
                result += "*";
                columns--;
            }
            result += "\n";
        }
        return result;
    }

    public String drawRect(int width, int height, char c) {
        String result = "";
        int i = 0;
        while (i++ < height) {
            int j = 0;
            while (j++ < width) {
                result += c;
            }
            result += "\n";
        }
        return result;
    }

    public String drawLine(int length) {
        String result = "";
        int i = 0;
        while (i++ < length) {
            if (i % 2 == 0) {
                result += "#";
            } else {
                result += "*";
            }
        }
        return result;
    }

    public String drawLineNew(int length) {
        String result = "";
        boolean star = true;
        while (length > 0) {
            result += star ? '*' : '#';
            star = !star;
            length--;
        }
        return result;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        int i = 0, j = 0;
        String result = "";
        while (j++ < repeatCount) {
            while (i < pattern.length) {
                result += pattern[i];
                i++;
            }
            i = 0;
        }
        return result;
    }

    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();

        System.out.println(helper.drawQuad(8));
        System.out.println(helper.drawQuadNew(8));
        System.out.println(helper.drawRect(2, 3, 'X'));

        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(5));
        System.out.println(helper.drawLineNew(5));

        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[]{'J', 'a', 'v', 'a'}, 3));

    }

}
