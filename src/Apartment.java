public class Apartment extends Families {

    public Apartment(String address, String family, int familyComposition, String familyMembers) {
        super(address, family, familyComposition, familyMembers);
    }

    @Override
    public void service() {
        System.out.println("Living in an apartment pays com services");
    }

    @Override
    public String toString() {
        return "Apartment-"+getAddress()+"\t"+getFamily()+"\t"+getFamilyComposition()+"\t"+getFamilyMembers();
    }
}
