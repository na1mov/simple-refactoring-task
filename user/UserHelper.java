package user;

import java.util.concurrent.atomic.AtomicInteger;

public class UserHelper {
    private final User userAnya = new User("Аня", "Смирнова", 10);
    private final User userRoma = new User("Рома", "Виноградов", 30);

    public void printUsers() {
        userAnya.printInfo();
        userAnya.printAdditionalInfo();

        userRoma.printInfo();
        userRoma.printAdditionalInfo();
    }

    public int calculateAverageAge() {
        User userUra = new User("Юра", "Карп", 28);
        return (userAnya.getAge() + userRoma.getAge() + userUra.getAge()) / 3;
    }

    public int calculateRate(AtomicInteger base, int age,
                             boolean hasWork, boolean hasHouse) {

        int res = base.get() + age / 100;
        if (hasWork)
            res *= 1.1;
        else
            res *= 0.9;

        if (hasHouse)
            res *= 1.1;
        else
            res *= 0.9;

        return res;
    }

    public String getBossName(User user) {
        return user.getBoss();
    }
}
