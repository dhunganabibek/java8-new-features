package stream;

import java.util.Objects;
import java.util.stream.Stream;

class Car{
    private String name;
    private String email;
    private int age;
    

    public Car() {
    }

    public Car(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car name(String name) {
        setName(name);
        return this;
    }

    public Car email(String email) {
        setEmail(email);
        return this;
    }

    public Car age(int age) {
        setAge(age);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(email, car.email) && age == car.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }





}

public class StreamMapCustomer {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "toyota@gmail.com", 23);
        Car car2 = new Car("Honda", "honda@gmail.com", 24);
        Car car3 = new Car("Nissan", "nissan@gmail.com", 67);
        Car car4 = new Car("Ford", "ford@gmail.com", 12);
        Car car5 = new Car("Tesla", "tesls@gmail.com", 9);

        Stream<Car> stream = Stream.of(car1, car2, car3, car4,car5);

        stream.map(car -> car.getAge()).forEach(System.out::println);
        
    }
    
}
