public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        String[] strs = name.split(" ");
        if (strs.length != 2) {
            return false;
        }
        if (strs[0].length() == 0 || strs[1].length() == 0){
            return false;
        }
        return name.length() >= 3 && name.length() <= 19;
    }
}