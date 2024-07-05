public class IntegerSetTest {

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
    }

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
    }

    public void testInsertAndDeleteElement() {
        IntegerSet set = new IntegerSet();

        set.insertElement(1);
        set.insertElement(3);

        set.deleteElement(1);
    }

    public void testToStringEmptySet() {
        IntegerSet set = new IntegerSet();
    }
    public void testEqualTo() {
        IntegerSet set1 = new IntegerSet();
        set1.insertElement(1);
        set1.insertElement(3);

        IntegerSet set2 = new IntegerSet();
        set2.insertElement(1);
        set2.insertElement(3);

    }
}

