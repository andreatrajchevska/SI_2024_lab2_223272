import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {

    @Test
    public void testMultipleConditionCoverage() {
        // Test case 1: True, True, True
        Item item1 = new Item("item1", "012345", 400, 0.1f);
        List<Item> items1 = Arrays.asList(item1);
        assertFalse(SILab2.checkCart(items1, 365)); // sum = 40, sum - 30 = 10, payment < sum

        // Test case 2: True, True, False
        Item item2 = new Item("item2", "112345", 400, 0.1f);
        List<Item> items2 = Arrays.asList(item2);
        assertTrue(SILab2.checkCart(items2, 36)); // sum = 40, payment >= sum

        // Test case 3: True, False, True
        Item item3 = new Item("item3", "012345", 400, 0.0f);
        List<Item> items3 = Arrays.asList(item3);
        assertFalse(SILab2.checkCart(items3, 370)); // sum = 400, payment < sum

        // Test case 4: True, False, False
        Item item4 = new Item("item4", "112345", 400, 0.0f);
        List<Item> items4 = Arrays.asList(item4);
        assertFalse(SILab2.checkCart(items4, 370)); // sum = 400, payment < sum

        // Test case 5: False, True, True
        Item item5 = new Item("item5", "012345", 200, 0.1f);
        List<Item> items5 = Arrays.asList(item5);
        assertTrue(SILab2.checkCart(items5, 20)); // sum = 20, payment >= sum

        // Test case 6: False, True, False
        Item item6 = new Item("item6", "112345", 200, 0.1f);
        List<Item> items6 = Arrays.asList(item6);
        assertTrue(SILab2.checkCart(items6, 20)); // sum = 20, payment >= sum

        // Test case 7: False, False, True
        Item item7 = new Item("item7", "012345", 200, 0.0f);
        List<Item> items7 = Arrays.asList(item7);
        assertTrue(SILab2.checkCart(items7, 200)); // sum = 200, payment >= sum

        // Test case 8: False, False, False
        Item item8 = new Item("item8", "112345", 200, 0.0f);
        List<Item> items8 = Arrays.asList(item8);
        assertTrue(SILab2.checkCart(items8, 200)); // sum = 200, payment >= sum
    }
}
