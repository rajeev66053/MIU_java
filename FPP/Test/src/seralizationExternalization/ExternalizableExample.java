package seralizationExternalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableExample {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee empObj = new Employee("Shanti", "Sharma", 32, "IT");
        System.out.println("Object before serialization  => " + empObj.toString());

        // Serialization
        serialize(empObj);

        // Deserialization
        Employee deserializedEmpObj = deserialize();
        System.out.println("Object after deserialization => " + deserializedEmpObj.toString());
    }

    // Serialization code
    static void serialize(Employee empObj) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("data.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(empObj);
        }
    }

    // Deserialization code
    static Employee deserialize() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("data.obj");
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            return (Employee) ois.readObject();
        }
    }

}
