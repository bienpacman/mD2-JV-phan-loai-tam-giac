package packaged;

import static org.junit.jupiter.api.Assertions.*;

class ClassificationOfTrianglesTest {

    @org.junit.jupiter.api.Test
    void classify222() {
        String result = packaged.ClassificationOfTriangles.classify(2, 2, 2);
        assertEquals(packaged.ClassificationOfTriangles.TYPE_EQUILATERAL, result);
    }

    @org.junit.jupiter.api.Test
    void classify223() {
        String result = packaged.ClassificationOfTriangles.classify(2, 2, 3);
        assertEquals(packaged.ClassificationOfTriangles.TYPE_ISOSCELES, result);

    }

    @org.junit.jupiter.api.Test
    void classify234() {
        String result = packaged.ClassificationOfTriangles.classify(2, 3, 4);
        assertEquals(packaged.ClassificationOfTriangles.TYPE_NORMAL, result);
    }

    @org.junit.jupiter.api.Test
    void classify238() {
        String result = packaged.ClassificationOfTriangles.classify(2, 3, 8);
        assertEquals(packaged.ClassificationOfTriangles.NOT_A_TRIANGLE ,result);
    }
}