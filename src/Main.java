import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<User> listAllUser = new ArrayList<>();

    public static void main(String[] args) {
        listAllUser.add(new User(20, "Vasyl"));
        listAllUser.add(new User(35, "Yulian"));
        listAllUser.add(new User(22, "Waran"));
        listAllUser.add(new User(27, "Nazar"));
        listAllUser.add(new User(18, "Volodia"));
        listAllUser.add(new User(40, "Vitaliy"));
        listAllUser.add(new User(26, "Adriana"));
        listAllUser.add(new User(33, "Petro"));
        listAllUser.add(new User(23, "Valia"));
        listAllUser.add(new User(19, "Nastya"));

        System.out.println("User hwo Younger 30 and sorted by name : ");
        List<User> listYoungPeople = listAllUser.stream()
                .filter((x) -> x.getAge() < 30)
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
                listYoungPeople.stream().forEach(user -> System.out.println(user.getName()));

    }
}
