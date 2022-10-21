public class Hostel extends Families{

    public Hostel(String address, String family, int familyComposition, String familyMembers) {
        super(address, family, familyComposition, familyMembers);
    }

    @Override
    public void service() {
         System.out.println("Living in a hostel pays rent");
    }

    @Override
    public String toString() {
        return "Hostel-"+getAddress()+"\t"+getFamily()+"\t"+getFamilyComposition()+"\t"+getFamilyMembers();
    }
}
