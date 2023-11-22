package week_5.car_factory;

public enum Extras_Catalogue {
    Navigation(500), Automatic(3000), AC(1500), Tempomat(350), ElGlss(250);

    private double price;
    Extras_Catalogue(double price) {
        this.price = price;
    }

    public static void printCatalogue() {
        System.out.println(Navigation.toString() + " - " + Navigation.price);
        System.out.println(Automatic.toString() + " - " + Automatic.price);
        System.out.println(AC.toString() + " - " + AC.price);
        System.out.println(Tempomat.toString() + " - " + Tempomat.price);
        System.out.println(ElGlss.toString() + " - " + ElGlss.price);
    }
}