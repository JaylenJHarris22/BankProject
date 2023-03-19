public class PersonalInfo {
    String firstName;
    String lastName;
    int age;
    String email;
    //    String streetAddress;
//    String city;
//    String state;
//    int zipcode;
    int birthMonth;
    int birthDay;
    int birthYear;

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBirthDate(int birthMonth, int birthDay, int birthYear){
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }
}
