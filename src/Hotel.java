public class Hotel extends Families {
    public Hotel(String address, String family, int familyComposition, String familyMembers) {
        super(address, family, familyComposition, familyMembers);
    }

    @Override
    public void service() {
        System.out.println("Staying in a hotel pays rent");
    }

    @Override
    public String toString() {
        return "Hotel-"+getAddress()+"\t"+getFamily()+"\t"+getFamilyComposition()+"\t"+getFamilyMembers();
    }
}
