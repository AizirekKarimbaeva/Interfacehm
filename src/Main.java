public class Main {
    public static void main(String[] args) {
       Apartment apartment = new Apartment("The family lives in an apartment", "Big family",
                    5, "Dad,mom,eldest daughter,youngest daughter and son");
        Person person = new Person("Same,Alisa,George,Bermet,Adam");
        System.out.println(apartment+"\t"+person.getName());
        apartment.service();
       Hostel hostel = new Hostel("The family lives in a hostel", "Young family",
                    2, "Husband,wife and twin son");
        Person person1 = new Person("Thomas, Aiisha,Jacob,Charley");
        System.out.println(hostel+"\t"+person1.getName());
        hostel.service();
       Hotel hotel = new Hotel("The family lives in a hotel", "Elderly family",
                    3, "Husband,wife and daughter");
        Person person2 = new Person("James,Dikota,Jesse");
        System.out.println(hotel+"\t"+person2.getName());
        hotel.service();
    }
}



