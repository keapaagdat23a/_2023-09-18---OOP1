package disappearingspy;

public class HeadQuarter {
  public static void main(String[] args) {
    new HeadQuarter().run();
  }

  private void run() {
    Spy spy1 = new Spy();
    spy1.spyName = "Agent Shadowstrike";
    spy1.health = 100;

    Spy spy2 = new Spy();
    spy2.spyName = "Phoenix Cipher";
    spy2.health = 50;

    printSpies(spy1, spy2);

    // WRONG:
    // spy1 = spy2;
    // RIGHT:
    spy1.spyName = spy2.spyName;
    spy1.health = spy2.health;
    printSpies(spy1, spy2);

    spy1.spyName = "Stealth Phantom";
    spy1.health = 99;
    printSpies(spy1, spy2);
  }

  private void printSpies(Spy spy1, Spy spy2) {
    System.out.println("\n" + spy1 + "\n" + spy2);
  }
}
