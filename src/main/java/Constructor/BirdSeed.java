package Constructor;

public class BirdSeed {

    private int numberBags;
    boolean call;

    public BirdSeed() {
        this.numberBags = 11;
        call = false;
    }

    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
        this.call = true;
    }

    public static void main(String[] args) {

        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);

        BirdSeed seed1 = new BirdSeed(7);
        System.out.println(seed1.numberBags);
        System.out.println(seed1.call);

        BirdSeed seed2 = new BirdSeed();
        System.out.println(seed2.call);


    }




    }



