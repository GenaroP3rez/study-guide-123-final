import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {

    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4,
                new ListNode(8,
                new ListNode(15,
                new ListNode(16,
                new ListNode(23,
                new ListNode(42,
                new ListNode(11,
                new ListNode(29,
                new ListNode(34)))))))));

        int actual = FinalPractice.oddIndexSum(list);

        assertEquals(95, actual);
    }

    @Test
    void testOddIndexSum_nullList() {
        assertEquals(0, FinalPractice.oddIndexSum(null));
    }

    @Test
    void testOddIndexSum_singleNode() {
        ListNode list = new ListNode(10);

        assertEquals(0, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_twoNodes() {
        ListNode list = new ListNode(10,
                new ListNode(20));

        assertEquals(20, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5,
                new ListNode(6))))));

        assertEquals(12, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_negativeValues() {
        ListNode list = new ListNode(-1,
                new ListNode(-2,
                new ListNode(-3,
                new ListNode(-4,
                new ListNode(-5)))));

        assertEquals(-6, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_mixedPositiveAndNegativeValues() {
        ListNode list = new ListNode(5,
                new ListNode(-10,
                new ListNode(15,
                new ListNode(20,
                new ListNode(25,
                new ListNode(-30))))));

        assertEquals(-20, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_allZeros() {
        ListNode list = new ListNode(0,
                new ListNode(0,
                new ListNode(0,
                new ListNode(0))));

        assertEquals(0, FinalPractice.oddIndexSum(list));
    }
}