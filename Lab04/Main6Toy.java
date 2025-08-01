public class Main6Toy {
    public static void main(String[] args) {
        EngineDriver teddy1 = new EngineDriver(25.5);
        Gardener teddy2 = new Gardener(51.2);
        Clown bunny1 = new Clown(93.2);
        BankManager bunny2 = new BankManager(24);

        System.out.println(teddy1.color);
        teddy1.describe();
        teddy1.makeNoise();

        System.out.println(bunny2.job);
        bunny2.describe();
        bunny2.makeNoise();

    }
}
  