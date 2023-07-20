import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Home home = new Home("Veshnevaia 1");
        Person igor = new Person("Igor", 2,"Raphael",home);
        Person renat = new Person("Renat",2,"Raphoel",home);
        Person aleksey = new Person("Aleksey",3,"Evgeniy",home);
        //System.out.println(igor);
        System.out.println(igor+"\n"+renat+"\n"+aleksey);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/person.out"));
        objectOutputStream.writeObject(igor);
        objectOutputStream.writeObject(renat);
        objectOutputStream.writeObject(aleksey);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/person.out"));
        Person igorRestored = (Person) objectInputStream.readObject();
        Person renatRestored = (Person) objectInputStream.readObject();
        Person alekseyRestored = (Person) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println();
        System.out.println(igorRestored+"\n"+renatRestored+"\n"+alekseyRestored);

    }
}