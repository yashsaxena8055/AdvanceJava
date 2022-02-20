package lambda;

import java.util.function.Predicate;

public class Person {

  private String firstName;
  private String lastName;
  private int age;

  Predicate<Person> isFirstNameValid=p->p.getFirstName().equals("");
  Predicate<Person> isLastNameValid=p->p.getLastName().equals("");
  Predicate<Person> isAgeAbove18=p->p.getAge()>=18;


  public Person() {
  }

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + '}';
  }

  public boolean isValid() {
  return isFirstNameValid.and(isLastNameValid.and(isAgeAbove18)).test(this);

  }

}