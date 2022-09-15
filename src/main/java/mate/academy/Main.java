package mate.academy;

public class Main {
    public static void main(String[] args) {
        User bob = new User("BobMasho007@gmail.com", 123, 18);
        User anna = new User("AnnaTocher@gmail.com", 68465431, 25);
        User vadim = new User("Valdemar@gmail.com", 435415,19);
        DataBase.dataBase.add(bob);
        DataBase.dataBase.add(anna);
        DataBase.dataBase.add(vadim);
        DataBase dataBase = new DataBase();
        System.out.println(dataBase.getUseByLogin("Valdemar@gmail.com"));

    }
}
