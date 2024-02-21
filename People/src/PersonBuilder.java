public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age = 0;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Incorrect age");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (age < 0 || name == null || surname == null || address == null) {
            throw new IllegalStateException("Missing info");
        } else {
            Person person = new Person(name, surname, age);
            person.setAddress(address);
            return person;
        }
    }
}
