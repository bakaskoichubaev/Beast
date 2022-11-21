public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("simba","25");
        Gepard gepard = new Gepard("bagira","35");
        Wolf wolf = new Wolf("karyshkyr","30");

        Beast [] beasts={tiger,gepard,wolf};
        for (Beast b:beasts) {
            System.out.println(b);
            b.attacking();
            b.speed();
        }
    }
}