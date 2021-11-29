package mailsender;

import lombok.Getter;

@Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;

    public Client(String name, int age, Gender sex) {
        this.id = IdGenerator.generateId();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static class IdGenerator {
        private static int id = 0;

        public static int generateId(){
            id += 1;
            return id;
        }
    }
}
