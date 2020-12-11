package Module2.src.main.java.botTasks;

class NameEncoderDecoder_46 {

    public String encode(String name) {
        String modifiedName = name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");

        return "NOTFORYOU" + modifiedName + "YESNOTFORYOU";
    }

    public String decode(String name) {
        String modifiedName = name
                .replace("YESNOTFORYOU","")
                .replace("NOTFORYOU","")
                .replace("1","e")
                .replace("2","u")
                .replace("3","i")
                .replace("4","o")
                .replace("5","a");

        return modifiedName.strip();
    }

    public static void main(String[] args) {
        NameEncoderDecoder_46 name = new NameEncoderDecoder_46();

        System.out.println(name.encode("Crab"));
        System.out.println(name.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        System.out.println(name.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
}