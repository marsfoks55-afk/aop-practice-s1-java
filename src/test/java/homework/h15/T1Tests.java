package homework.h15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T1Tests {
    private T1 solver;

    @BeforeEach
    void setUp() {
        solver = new T1();
    }

    @Test
    @DisplayName("Базовий випадок з LeetCode #1: повне дерево висоти 3")
    void testStandardFullTree() {
        TreeNode root =
                new TreeNode(
                        4,
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        TreeNode expected =
                new TreeNode(
                        4,
                        new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                        new TreeNode(2, new TreeNode(3), new TreeNode(1)));

        TreeNode actual = solver.invertTree(root);
        assertTrue(areTreesEqual(expected, actual));
    }

    @Test
    @DisplayName("Базовий випадок з LeetCode #2: дерево з трьох вузлів [2,1,3]")
    void testThreeNodesTree() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode expected = new TreeNode(2, new TreeNode(3), new TreeNode(1));

        assertTrue(areTreesEqual(expected, solver.invertTree(root)));
    }

    @Test
    @DisplayName("Порожнє дерево (null) повертає null")
    void testNullRoot() {
        assertNull(solver.invertTree(null));
    }

    @Test
    @DisplayName("Дерево з одного кореневого вузла залишається незмінним")
    void testSingleNode() {
        TreeNode root = new TreeNode(42);
        TreeNode actual = solver.invertTree(root);

        assertEquals(42, actual.val);
        assertNull(actual.left);
        assertNull(actual.right);
    }

    @Test
    @DisplayName("Лівостороннє вироджене дерево перетворюється на правостороннє")
    void testLeftSkewedTree() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        TreeNode expected = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));

        assertTrue(areTreesEqual(expected, solver.invertTree(root)));
    }

    @Test
    @DisplayName("Асиметричне дерево з від'ємними значеннями")
    void testAsymmetricTreeWithNegativeValues() {
        TreeNode root = new TreeNode(-10, new TreeNode(-20, null, new TreeNode(-15)), new TreeNode(5));
        TreeNode expected =
                new TreeNode(-10, new TreeNode(5), new TreeNode(-20, new TreeNode(-15), null));

        assertTrue(areTreesEqual(expected, solver.invertTree(root)));
    }

    private boolean areTreesEqual(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null || a.val != b.val) {
            return false;
        }
        return areTreesEqual(a.left, b.left) && areTreesEqual(a.right, b.right);
    }
}