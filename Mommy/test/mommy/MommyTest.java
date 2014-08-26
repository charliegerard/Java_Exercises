package mommy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MommyTest {

//    @Test
//    public void shouldCheckIfWordIsMommyfiable(){
//        Mommy mommy = new Mommy();
//        assertTrue(mommy.shouldBeMommyfied("a"));
//    }
//
//    @Test
//    public void shouldCheckIfWordIsNotMommyfiable(){
//        Mommy mommy = new Mommy();
//        assertFalse(mommy.shouldBeMommyfied("b"));
//    }
//
//    @Test
//    public void shouldMommyfyIfVowelsMoreThanThirtyPercent(){
//        Mommy mommy = new Mommy();
//        assertTrue(mommy.shouldBeMommyfied("ba"));
//    }
//
//    @Test
//    public void shouldReturnBMommyIfWordIsBa(){
//        Mommy mommy = new Mommy();
//        assertThat(mommy.mommyfy("ba"), is("bmommy"));
//    }
//
//    @Test
//    public void shouldReturnBMommyIfWordIsBaa(){
//        Mommy mommy = new Mommy();
//        assertThat(mommy.mommyfy("baa"), is("bmommy"));
//    }
//
//    @Test
//    public void shouldReturnMommyBMommyIfWordIsAba(){
//        Mommy mommy = new Mommy();
//        assertThat(mommy.mommyfy("aba"), is("mommybmommy"));
//    }
//
//    @Test
//    public void shouldNotBeMommyfiedIfWordIsBbba(){
//        Mommy mommy = new Mommy();
//        assertThat(mommy.mommyfy("bbba"), is("bbba"));
//    }
//
//    @Test
//    public void shouldReturnEmptyStringIfWordEmpty(){
//        Mommy mommy = new Mommy();
//        assertFalse(mommy.shouldBeMommyfied(""));
//        assertThat(mommy.mommyfy(""), is(""));
//    }
//
//    @Test (expected = IllegalArgumentException.class)
//    public void shouldThrowExceptionIfWordIsNull(){
//        Mommy mommy = new Mommy();
//        assertNull(mommy.shouldBeMommyfied(null));
//    }

    @Test
    public void shouldReturnTrueIfWordHasVowels(){
        Mommy mommy = new Mommy();
        assertTrue(mommy.hasVowels("ba"));
    }
//
//    @Test
//    public void shouldReturnTrueIfWordHasConsecutiveVowels(){
//        Mommy mommy = new Mommy();
//        String s = "baa";
//        assertTrue(mommy.hasConsecutiveVowels(s));
//    }

    @Test
    public void shouldReturnTrueIfWordShouldBeMommyfied(){
        Mommy mommy = new Mommy();
        assertTrue(mommy.shouldBeMommyfied("a"));
        assertTrue(mommy.shouldBeMommyfied("baaaa"));
    }

    @Test
    public void shouldReturnMommyIfWordIsA(){
        Mommy mommy = new Mommy();
        assertEquals("mommy", mommy.mommyfy("a"));
    }

    @Test
    public void shouldReturnBmommyWhenWordIsBa(){
        Mommy mommy = new Mommy();
        assertEquals("bmommy", mommy.mommyfy("ba"));
    }

    @Test
    public void shouldReturnBmommyIfWordIsBaa(){
        Mommy mommy = new Mommy();
        assertEquals("bmommy", mommy.mommyfy("baa"));
    }


}
