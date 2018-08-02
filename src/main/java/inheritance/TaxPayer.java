package inheritance;

public class TaxPayer extends Person{

    private long socialNumber;

    private String address;

    private String bankName;

    private long bankAccountNumber;

    public long getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(long socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "TaxPayer{" +
                "socialNumber=" + socialNumber +
                ", address='" + address + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}
