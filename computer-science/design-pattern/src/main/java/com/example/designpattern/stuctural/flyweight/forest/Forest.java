package com.example.designpattern.stuctural.flyweight.forest;

import com.example.designpattern.stuctural.flyweight.tree.Tree;
import com.example.designpattern.stuctural.flyweight.tree.TreeFactory;
import com.example.designpattern.stuctural.flyweight.tree.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType treeType = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics g) {
        for (Tree tree : trees) {
            tree.draw(g);
        }
    }
}
