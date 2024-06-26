package exercises.Person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(){

    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public boolean isTeen(){
        boolean result;
        if (this.age > 12 && this.age < 20){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }else if(this.lastName.isEmpty()){
            return this.firstName;
        }else if(this.firstName.isEmpty()){
            return this.lastName;
        }else{
            return String.format("%s %s", this.firstName, this.lastName);
        }
    }
}