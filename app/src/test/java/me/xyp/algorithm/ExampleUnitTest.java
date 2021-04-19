package me.xyp.algorithm;

import android.util.Log;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import me.xyp.algorithm.sort.Bubble;
import me.xyp.algorithm.sort.Insertion;
import me.xyp.algorithm.sort.Merge;
import me.xyp.algorithm.sort.Selection;
import me.xyp.algorithm.sort.Shell;
import me.xyp.algorithm.sort.Quick;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    final String TAG = "TEST";

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void bubbleTest() {
        Integer[] arr = {4, 5, 6, 3, 2, 1};
        Bubble.sort(arr);
        System.out.println("bubbleTest>>>"+Arrays.toString(arr));//[1, 2, 3, 4, 5, 6]
    }

    @Test
    public void selectionTest() {
        Integer[] arr = {4, 5, 3, 6, 2, 1,};
        Selection.sort(arr);
        System.out.println("selectionTest>>>"+Arrays.toString(arr));//[1, 2, 3, 4, 5, 6]
    }

    @Test
    public void insertionTest() {
        Integer[] arr = {4, 5, 3, 6, 2, 1,};
        Insertion.sort(arr);
        System.out.println("insertionTest>>>"+Arrays.toString(arr));//[1, 2, 3, 4, 5, 6]
    }

    @Test
    public void shellTest() {
        Integer[] arr = {4, 5, 3, 6, 2, 1,5,9,7,8};
        Shell.sort(arr);
        System.out.println("shellTest>>>"+Arrays.toString(arr));
    }

    @Test
    public void mergeTest() {
        Integer[] arr = {4, 5, 3, 6, 2, 1,5,9,7,8};
        Merge.sort(arr);
        System.out.println("mergeTest>>>"+Arrays.toString(arr));
    }

    @Test
    public void quickTest() {
        Integer[] arr = {4, 5, 3, 6, 2, 1,5,9,7,8};
        Quick.sort(arr);
        System.out.println("quickTest>>>"+Arrays.toString(arr));
        LinkedList
    }
}