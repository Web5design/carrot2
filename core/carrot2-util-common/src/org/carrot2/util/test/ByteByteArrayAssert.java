package org.carrot2.util.test;

import static org.fest.assertions.Assertions.assertThat;

import org.fest.assertions.AssertExtension;

/**
 * Assertions on <code>byte [][]</code> arrays.
 */
public class ByteByteArrayAssert implements AssertExtension
{
    /** The actual array */
    private byte [][] actualArray;

    /** Description of the assertion */
    private String description;

    ByteByteArrayAssert(byte [][] array)
    {
        this.actualArray = array;
    }

    /**
     * Asserts that the array is equal to the provided
     */
    public ByteByteArrayAssert isEqualTo(byte [][] expected)
    {
        assertThat(expected).as(description).isNotNull();
        assertThat(actualArray.length).as(description).isEqualTo(expected.length);

        for (int i = 0; i < expected.length; i++)
        {
            assertThat(actualArray[i]).as(description).isEqualTo(expected[i]);
        }
        return this;
    }

    public ByteByteArrayAssert as(String description)
    {
        this.description = description;
        return this;
    }
}
