package inheritance;

public class InheritanceRunner {
    public static void main(String[] args) {

        Animal animal = new Clownfish();

        animal.breatheOxygen();

        Animal otherAnimal = new DomesticCat();

        otherAnimal.consumeOrganics();


        TaxPayer taxPayer = new TaxPayer();
        taxPayer.setAddress("Billy Bob boulevard, 15");
        taxPayer.setBankAccountNumber(6546546546546654654L);
        taxPayer.setBankName("United Finances");
        taxPayer.setSocialNumber(885545666444556L);

        System.out.println(taxPayer.toString());

        taxPayer.eukaryoteFeature();
        taxPayer.breatheOxygen();
        taxPayer.reproduce();
        taxPayer.consumeOrganics();

    }
}
