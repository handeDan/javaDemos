public class Ring {
    //instance variables:
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    //consructor:
    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    //methods:
    public void run() {
        if (checkWeight()) {
            // İlk dövüşe başlayanı rastgele seçiyoruz:
            boolean firstFighterStarts = Math.random() < 0.5; //%50 olasılıkla ilk vuruşu yapan dövüşçü belirleniyor.

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");

                if (firstFighterStarts) {
                    //Eğer firstFighterStarts true ise f1 önce vuruyor,
                    f2.health = f1.hit(f2);
                    if (isWin()) break;
                    f1.health = f2.hit(f1);
                    if (isWin()) break;
                } else {
                    //Eğer false ise f2 önce vuruyor.
                    f1.health = f2.hit(f1);
                    if (isWin()) break;
                    f2.health = f1.hit(f2);
                    if (isWin()) break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
