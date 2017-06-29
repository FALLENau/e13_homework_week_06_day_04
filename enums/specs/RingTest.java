import static org.junit.Assert.*;
import org.junit.*;
import jewellery.*;

public class RingTest {

  Ring ring;

  @Before
  public void before(){
    ring = new Ring(MetalType.GOLD);
  }

  @Test
  public void canGetMetal(){
    assertEquals(MetalType.GOLD,ring.getMetal());
  }

  // @Test
  // public void metalCanBeMispelled() {
  //   ring = new Ring("Golf");
  //   assertEquals("golf", ring.getMetal());
  // }
  //
  // @Test
  // public void metalCanBeNonsense() {
  //   ring = new Ring("Onion");
  //   assertEquals("Onion", ring.getMetal());
  // }

}
