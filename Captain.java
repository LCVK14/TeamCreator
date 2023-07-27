public class Captain {

    String name;
    int jerseyNum, age;
    char position;

    public Captain() {
        name = "";
        jerseyNum = 0;
        age = 0;
        position = ' ';

    }

    // Default constructor
    public Captain(String nm, int num, int playerAge, char role) {
        name = nm;
        jerseyNum = num;
        age = playerAge;
        position = role;
    }

    // Accessor Methods
    public String getName() {
        return name;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public int getAge() {
        return age;
    }

    public char getPosition() {
        return position;
    }

    public String toString() {
        String str;
        str = "\nCaptain Name: " + name +
                "\nCaptain Jersey Number: " + jerseyNum +
                "\nCaptain age: " + age +
                "\nCaptain position: " + position +
                "\n-------------------------";

        return str;
    }
}