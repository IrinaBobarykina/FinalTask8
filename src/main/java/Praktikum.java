public class Praktikum {

    public static void main(String[] args) {

        String cardName = "Тимоти Шаломе";
        Account timotiAccount = new Account(cardName);
        System.out.println(timotiAccount.checkNameToEmboss());
    }

}