package seedu.address.testutil;

import java.util.ArrayList;
import java.util.Arrays;

import seedu.address.commons.core.index.Index;

/**
 * A utility class containing a list of {@code Index} objects to be used in tests.
 */
public class TypicalIndexes {
    public static final Index INDEX_FIRST_PERSON = Index.fromOneBased(1);
    public static final Index INDEX_SECOND_PERSON = Index.fromOneBased(2);
    public static final Index INDEX_THIRD_PERSON = Index.fromOneBased(3);
    public static final ArrayList<Index> INDEX_LIST_FIRST =
            new ArrayList<>(Arrays.asList(INDEX_FIRST_PERSON));
    public static final ArrayList<Index> INDEX_LIST_SECOND =
            new ArrayList<>(Arrays.asList(INDEX_SECOND_PERSON));
    public static final ArrayList<Index> INDEX_LIST_THIRD =
            new ArrayList<>(Arrays.asList(INDEX_THIRD_PERSON));
    public static final ArrayList<Index> INDEX_LIST_THREE =
            new ArrayList<>(Arrays.asList(INDEX_FIRST_PERSON, INDEX_SECOND_PERSON, INDEX_THIRD_PERSON));
}
