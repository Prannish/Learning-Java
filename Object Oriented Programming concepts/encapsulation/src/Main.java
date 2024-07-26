
class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String Name;
    private int Roll;
    private int Age;

    // get method for age to access
    // private variable geekAge
    public int getAge()
    {
        return Age;
    }

    // get method for name to access
    // private variable geekName
    public String getName()
    {
        return Name;
    }

    // get method for roll to access
    // private variable geekRoll
    public int getRoll()
    {
        return Roll;
    }

    // set method for age to access
    // private variable geekage
    public void setAge(int newAge)
    {
        Age = newAge;
    }

    // set method for name to access
    // private variable geekName
    public void setName(String newName)
    {
        Name = newName;
    }

    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) {
        Roll = newRoll;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Pranish");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("name: " + obj.getName());
        System.out.println("age: " + obj.getAge());
        System.out.println("roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}