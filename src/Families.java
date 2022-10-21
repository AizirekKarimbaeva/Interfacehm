public abstract class Families implements Living{
    private String address;
    private String family;
    private int familyComposition;
    private String familyMembers;

    public Families(String address, String family, int familyComposition, String familyMembers) {
        this.address = address;
        this.family = family;
        this.familyComposition = familyComposition;
        this.familyMembers = familyMembers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getFamilyComposition() {
        return familyComposition;
    }

    public void setFamilyComposition(int familyComposition) {
        this.familyComposition = familyComposition;
    }

    public String getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(String familyMembers) {
        this.familyMembers = familyMembers;
    }

    @Override
    public String toString() {
        return "Families" +
                "Address: " + address + '\'' +
                "Family: " + family + '\'' +
                "Family composition: " + familyComposition +
                "Family members: " + familyMembers + '\'' +
                '}';
    }
}
