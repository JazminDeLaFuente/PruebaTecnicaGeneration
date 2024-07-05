public class IntegerSetTest {
    @Test
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.insertElement(1);
        set1.insertElement(3);
        set1.insertElement(5);

        IntegerSet set2 = new IntegerSet();
        set2.insertElement(3);
        set2.insertElement(5);
        set2.insertElement(7);

        IntegerSet expectedUnion = new IntegerSet();
        expectedUnion.insertElement(1);
        expectedUnion.insertElement(3);
        expectedUnion.insertElement(5);
        expectedUnion.insertElement(7);

        IntegerSet actualUnion = set1.union(set2);
        assertTrue(actualUnion.equalTo(expectedUnion));
    }

    @Test
    public void testIntersection() {
        IntegerSet set1 = new IntegerSet();
        set1.insertElement(1);
        set1.insertElement(3);
        set1.insertElement(5);

        IntegerSet set2 = new IntegerSet();
        set2.insertElement(3);
        set2.insertElement(5);
        set2.insertElement(7);

        IntegerSet expectedIntersection = new IntegerSet();
        expectedIntersection.insertElement(3);
        expectedIntersection.insertElement(5);

        IntegerSet actualIntersection = set1.intersection(set2);
        assertTrue(actualIntersection.equalTo(expectedIntersection));
    }

    @Test
    public void testInsertAndDeleteElement() {
        IntegerSet set = new IntegerSet();

        set.insertElement(1);
        set.insertElement(3);
        assertTrue(set.toSetString().equals("1 3"));

        set.deleteElement(1);
        assertTrue(set.toSetString().equals("3"));
    }

    @Test
    public void testToStringEmptySet() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.toSetString().equals("-"));
    }

    @Test
    public void testEqualTo() {
        IntegerSet set1 = new IntegerSet();
        set1.insertElement(1);
        set1.insertElement(3);

        IntegerSet set2 = new IntegerSet();
        set2.insertElement(1);
        set2.insertElement(3);

        assertTrue(set1.equalTo(set2));
    }
}

