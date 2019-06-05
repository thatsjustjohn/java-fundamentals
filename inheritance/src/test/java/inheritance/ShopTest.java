package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    public Shop shopSetup(){
        Shop classUnderTest = new Shop("Amazon Go", "Shop where you pay for stealing", 2);
        classUnderTest.addReview(new Review("John", "I feel like im stealing stuff", 4));
        classUnderTest.addReview(new Review( "Jane", "Good customer service", 5));
        return classUnderTest;
    }

    @Test
    public void test_addReview_TestAdd(){
        Shop classUnderTest = new Shop("Amazon Go", "Shop where you pay for stealing", 2);
        int previousSize = classUnderTest.getReviews().size();
        classUnderTest.addReview(new Review("John", "I feel like im stealing stuff", 4));
        assertNotEquals(previousSize, classUnderTest.getReviews().size());
    }

    @Test
    public void test_toString() {
        Shop classUnderTest = shopSetup();
        assertEquals("Amazon Go has 4.5 out of 5 stars and has a price of $$ and have 2 reviews\n" +
                        "Description: Shop where you pay for stealing\n" +
                        "Reviews:\nAuthor: John\nStars: 4\nBody: I feel like im stealing stuff\n" +
                        "Author: Jane\nStars: 5\nBody: Good customer service\n",
                classUnderTest.toString());
    }


}