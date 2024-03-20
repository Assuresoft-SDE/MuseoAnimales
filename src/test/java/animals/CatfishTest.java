package animals;

import enums.DigestionType;
import enums.RespirationType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CatfishTest {
    private Catfish catfish;

    @BeforeEach
    public void setup() {
        this.catfish = new Catfish(
                "Catfish",
                "Catfishus",
                "2023-01-01", "Siluridae",
                DigestionType.HERVIBORE,
                RespirationType.BRANCHIAL
        );
    }

    @Test
    void testReproduceValidMate() {
        Catfish catfishOther = new Catfish(
                "CatfishOther",
                "Catfishus",
                "2023-01-01",
                "Siluridae",
                DigestionType.HERVIBORE,
                RespirationType.BRANCHIAL
        );

        Animal child = null;
        try {
            child = catfish.reproduce(catfishOther);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(child);
        assertTrue(child instanceof Catfish);

        Catfish catfishChild = (Catfish) child;
        assertEquals("Catfish CatfishOther", catfishChild.getInformation().getName());
    }

    @Test
    void testReproduceInvalidMateThrowsException() {
        Animal wolf = mock(Wolf.class);

        Exception exception = assertThrows(Exception.class, () -> catfish.reproduce(wolf));
        assertEquals("The mate is not a Catfish", exception.getMessage());
    }
}
