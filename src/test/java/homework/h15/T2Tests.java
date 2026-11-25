package homework.h15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T2Tests {
    private T2 solver;

    @BeforeEach
    void setUp() {
        solver = new T2();
    }

    @Test
    @DisplayName("Базовий випадок з LeetCode #1: діапазон [7, 15] -> сума 32")
    void testStandardExample1() {
        TreeNode root =
                new TreeNode(
                        10,
                        new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                        new TreeNode(15, null, new TreeNode(18)));

        assertEquals(32, solver.rangeSumBST(root, 7, 15));
    }

    @Test
    @DisplayName("Базовий випадок з LeetCode #2: діапазон [6, 10] -> сума 23")
    void testStandardExample2() {
        TreeNode root =
                new TreeNode(
                        10,
                        new TreeNode(
                                5, new TreeNode(3, new TreeNode(1), null), new TreeNode(7, new TreeNode(6), null)),
                        new TreeNode(15, new TreeNode(13), new TreeNode(18)));

        assertEquals(23, solver.rangeSumBST(root, 6, 10));
    }

    @Test
    @DisplayName("Порожнє дерево (null) повертає 0")
    void testNullRoot() {
        assertEquals(0, solver.rangeSumBST(null, 1, 100));
    }

    @Test
    @DisplayName("Усі вузли менші за нижню межу low (перевірка гілки root.val < low)")
    void testAllNodesBelowRange() {
        TreeNode root =
                new TreeNode(10, new TreeNode(5, new TreeNode(2), new TreeNode(7)), new TreeNode(15));

        assertEquals(0, solver.rangeSumBST(root, 20, 50));
    }

    @Test
    @DisplayName("Усі вузли більші за верхню межу high (перевірка гілки root.val > high)")
    void testAllNodesAboveRange() {
        TreeNode root =
                new TreeNode(20, new TreeNode(15), new TreeNode(30, new TreeNode(25), new TreeNode(40)));

        assertEquals(0, solver.rangeSumBST(root, 1, 10));
    }

    @Test
    @DisplayName("Точний збіг із межами: low == high == val єдиного вузла")
    void testExactBoundarySingleNode() {
        TreeNode root = new TreeNode(10);

        assertEquals(10, solver.rangeSumBST(root, 10, 10));
        assertEquals(0, solver.rangeSumBST(root, 11, 15));
        assertEquals(0, solver.rangeSumBST(root, 1, 9));
    }

    @Test
    @DisplayName("Діапазон охоплює абсолютно всі вузли дерева")
    void testRangeIncludesEntireTree() {
        TreeNode root =
                new TreeNode(
                        8,
                        new TreeNode(4, new TreeNode(2), new TreeNode(6)),
                        new TreeNode(12, new TreeNode(10), new TreeNode(14)));

        // 2 + 4 + 6 + 8 + 10 + 12 + 14 = 56
        assertEquals(56, solver.rangeSumBST(root, 1, 100));
    }
}